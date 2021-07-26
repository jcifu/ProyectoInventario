
package com.example.proyectoInventario.service;

import com.example.proyectoInventario.dao.OrdersDAO;
import com.example.proyectoInventario.domain.Orders;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jacif
 */

@Service("ordersServiceImpl")
public class OrdersServiceImpl implements OrdersService{
    
    @Autowired
    @Qualifier("ordersDAO")
    private OrdersDAO ordersDAO;

    @Override
    @Transactional(readOnly = true)
    public List<Orders> findByStatus(String status) {
        return ordersDAO.findByStatus(status);
    }
     
   @Override
    public void insertOrders(Orders orders) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Orders> findByCustomerName(String customerName) {
        return ordersDAO.findByCustomerName(customerName);
    }
/*
    @Override
    public List<Orders> findByDate(String requiredDate, String shippedDate){
        return ordersDAO.findByDate(shippedDate, requiredDate);
    }
    */
    
    @Override
    public List<String> getAllStatus() {
        List<String> statusList = ordersDAO.getAllStatus();
        return statusList;
    }
    
    @Override
    public List<String> getAllCustomers(){
        List<String> customersList = ordersDAO.getAllCustomers();
        return customersList;
    }
}