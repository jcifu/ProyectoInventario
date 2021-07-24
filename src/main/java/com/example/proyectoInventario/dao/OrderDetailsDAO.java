package com.example.proyectoInventario.dao;

import com.example.proyectoInventario.domain.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jacif
 */
@Repository("orderDetailsDAO")
public interface OrderDetailsDAO extends JpaRepository<OrderDetails,Integer> {
    
}
