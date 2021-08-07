package com.example.proyectoInventario.dao;

import com.example.proyectoInventario.domain.Orders;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jacif
 */
@Repository("ordersDAO")
public interface OrdersDAO extends JpaRepository<Orders,Integer>{
    
    @Query(value = "SELECT DISTINCT o.status FROM orders o ORDER BY o.status", nativeQuery = true)
    @Transactional(readOnly = true)
    public List<String> getAllStatus();
    
    @Query(value = "SELECT DISTINCT c.customerName AS customersList "
            + "FROM orders o INNER JOIN customers c ON o.customerNumber = c.customerNumber ORDER BY c.customerName;", 
            nativeQuery = true)
    public List<String> getAllCustomers();
    
    
    @Query(value = "SELECT o.*, c.customerName FROM orders AS o"
            + " INNER JOIN customers c ON o.customerNumber = c.customerNumber"
            + " WHERE o.status= :status ORDER BY o.orderNumber", nativeQuery = true)
    //name = "findByStatus")
    @Transactional(readOnly = true)
    public List<Orders> findByStatus(String status);
    
    @Query(value = "SELECT ord.*, c.customerName FROM orders ord"
            + " INNER JOIN customers c ON ord.customerNumber = c.customerNumber"
            + " WHERE c.customerName= :customerName"
            + " ORDER BY o.orderNumber", nativeQuery = true)
    @Transactional(readOnly = true)
    public List<Orders> findByCustomerName(String customerName);
    
    @Query(value = "SELECT o.*, c.customerName FROM orders AS o"
            + " INNER JOIN customers c ON o.customerNumber = c.customerNumber"
            + " WHERE o.status= :status OR c.customerName= :customerName"
            + " ORDER BY o.orderNumber", nativeQuery = true)
    @Transactional(readOnly = true)
    public List<Orders> findByStatusOrCustomerName(String status, String customerName);
    
    /*@Query(value = "SELECT o FROM orders o WHERE o.orderDate BETWEEN o.requiredDate = :requiredDate AND o.shippedDate = :shippedDate", nativeQuery = true)
    @Transactional(readOnly = true)
    public List<Orders> findByDate(@Param ("orderDate") String orderDate, @Param("requiredDate") String shippedDate); */
}   
