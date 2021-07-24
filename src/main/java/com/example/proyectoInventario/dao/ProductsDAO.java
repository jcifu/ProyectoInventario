package com.example.proyectoInventario.dao;

import com.example.proyectoInventario.domain.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jacif
 */
@Repository("productsDAO")
public interface ProductsDAO extends JpaRepository<Products,String> {
    
}
