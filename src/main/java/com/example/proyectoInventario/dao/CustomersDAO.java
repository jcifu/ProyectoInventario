package com.example.proyectoInventario.dao;

import com.example.proyectoInventario.domain.Customers;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jacif
 */
@Repository("customerDAO")
public interface CustomersDAO extends JpaRepository<Customers,Integer> {
    
}
