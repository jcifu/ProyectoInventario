package com.example.proyectoInventario.web;


import com.example.proyectoInventario.domain.Orders;
import com.example.proyectoInventario.service.OrdersService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author jacif
 */
@Controller
@Slf4j
public class IndexController {

    String url = "";

    @Autowired
    //@Qualifier("ordersServiceImpl")
    private OrdersService ordersService; 
    /*
    @GetMapping("/")
    public String getIndexPage(){
        return "index";
    }
    */
    
    @GetMapping("/")
    public String getOrdersMonitor(Model model){
        List<String> statusDropdown = ordersService.getAllStatus();
        model.addAttribute("statusDropdown", statusDropdown);
        
        List<String> customersDropdown = ordersService.getAllCustomers();
        model.addAttribute("customersDropdown", customersDropdown);
        
        return "index";
    }
    
    @PostMapping("/searchOrders") 
    public String searchOrders(@ModelAttribute("ordersList") Orders orders, @RequestParam(value="status") String status,
            @RequestParam(value="customer") String customer, Model model){ //@RequestParam(value = "search", required = false) 

            List<Orders> ordersList = ordersService.findByStatus(status);
            model.addAttribute("ordersList", ordersList);
            return "index";
            
            /*
            List<Orders> ordersList = ordersService.findByCustomerName(customer);
            model.addAttribute("ordersList", ordersList);
            return "index";
            
            */
    }
}
