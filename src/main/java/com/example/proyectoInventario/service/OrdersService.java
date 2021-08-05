
package com.example.proyectoInventario.service;

import com.example.proyectoInventario.domain.Orders;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author jacif
 */
@Service 
public interface OrdersService {
    
    public List<String> getAllCustomers();
    
    public List<String> getAllStatus();
    
    
    public List<Orders> findByStatus(String status);
    
    public List<Orders> findByCustomerName(String customerName);
    
    // public List<Orders> findByDate(String requiredDate, String shippedDate);
}
