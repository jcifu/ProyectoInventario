package com.example.proyectoInventario.dao;

import com.example.proyectoInventario.domain.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jacif
 */
@Repository("paymentsDAO")
public interface PaymentsDAO extends JpaRepository<Payments,Integer> {
    
}
