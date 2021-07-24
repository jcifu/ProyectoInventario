
package com.example.proyectoInventario.service;

import com.example.proyectoInventario.domain.Orders;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author jacif
 */
@Service 
public interface OrdersService {
    
    // public List<Orders> listOrders();
    
    // public Orders searchOrders(Orders orders);
    
    public List<Orders> findByStatus(String status);
    
    public Optional<Orders> findByCustomerNumber(Integer customerNumber);
    
    // public List<Orders> findByDate(String requiredDate, String shippedDate);
    
    public List<String> getAllCustomers();
    
    public List<String> getAllStatus();
    
    public void insertOrders (Orders orders);
}
