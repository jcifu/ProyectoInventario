package com.example.proyectoInventario.dao;

import com.example.proyectoInventario.domain.Orders;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author jacif
 */
@Repository("ordersDAO")
public interface OrdersDAO extends JpaRepository<Orders,Integer>{
    
    @Query(value = "SELECT DISTINCT o.status FROM orders o ORDER BY o.status", nativeQuery = true)
    @Transactional(readOnly = true)
    public List<String> getAllStatus();
    
    @Query(value = "SELECT DISTINCT CONCAT(c.customerNumber, \" - \", c.customerName) AS customersList "
            + "FROM orders o INNER JOIN customers c ON o.customerNumber = c.customerNumber ORDER BY c.customerNumber;", 
            nativeQuery = true)
    public List<String> getAllCustomers();
    
    
    
    @Query(value = "SELECT o.orderNumber, o.orderDate, o.requiredDate FROM orders o WHERE o.status= ?1 ", nativeQuery = true)
    //name = "findByStatus")
    @Transactional(readOnly = true)
    public List<Orders> findByStatus(String status);
    
    @Query(value = "SELECT o FROM orders o WHERE o.customerNumber= :customerNumber", nativeQuery = true)
    @Transactional(readOnly = true)
    public Optional<Orders> findByCustomerNumber(@Param ("customerNumber") Integer customerNumber);
    
    /*@Query(value = "SELECT o FROM orders o WHERE o.orderDate BETWEEN o.requiredDate = :requiredDate AND o.shippedDate = :shippedDate", nativeQuery = true)
    @Transactional(readOnly = true)
    public List<Orders> findByDate(@Param ("orderDate") String orderDate, @Param("requiredDate") String shippedDate); */
}   
