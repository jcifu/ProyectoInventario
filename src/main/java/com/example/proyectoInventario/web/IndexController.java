package com.example.proyectoInventario.web;

import com.example.proyectoInventario.domain.Orders;
import com.example.proyectoInventario.service.OrdersService;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
    private OrdersService ordersService; 
    /*
    @GetMapping("/")
    public String getIndexPage(){
        return "index";
    }
    */
    
    @GetMapping("/")
    public String getOrdersMonitor(Model model){
        log.info("Mapping Orders Monitor");
        List<String> statusDropdown = ordersService.getAllStatus();
        model.addAttribute("statusDropdown", statusDropdown);
        
        List<String> customersDropdown = ordersService.getAllCustomers();
        model.addAttribute("customersDropdown", customersDropdown);
        
        return "index";
    }
    
    @GetMapping("/searchOrders")
    public String searchOrders(@ModelAttribute("ordersList") Orders orders, @RequestParam(value="status", required = false) String status,
            Model model, @RequestParam(value = "customer", required = false) String customer){
        
        
        
        
        List<Orders> ordersList = new ArrayList<>();
        ordersList = ordersService.findByStatusOrCustomerName(status, customer);
        /*if(customer != null){
             ordersList = ordersService.findByCustomerName(customer);
        }
        else if(status != null){
            ordersList = ordersService.findByStatus(status);
        }*/
        model.addAttribute("ordersList", ordersList);
        
        List<String> customersDropdown = ordersService.getAllCustomers();
        model.addAttribute("customersDropdown", customersDropdown);
        
        List<String> statusDropdown = ordersService.getAllStatus();
        model.addAttribute("statusDropdown", statusDropdown);
        
        return "index";
    }
}
