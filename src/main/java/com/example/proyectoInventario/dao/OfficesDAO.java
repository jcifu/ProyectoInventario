package com.example.proyectoInventario.dao;

import com.example.proyectoInventario.domain.Offices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jacif
 */
@Repository("officesDAO")
public interface OfficesDAO extends JpaRepository<Offices,String> {
    
}
