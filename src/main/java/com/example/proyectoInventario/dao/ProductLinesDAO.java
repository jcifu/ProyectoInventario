package com.example.proyectoInventario.dao;

import com.example.proyectoInventario.domain.ProductLines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jacif
 */
@Repository("productLinesDAO")
public interface ProductLinesDAO extends JpaRepository<ProductLines,String> {
    
}
