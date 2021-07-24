package com.example.proyectoInventario.ProyectoInventario;


import com.example.proyectoInventario.dao.OrdersDAO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import com.example.proyectoInventario.dao.ProductsDAO;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE) // no reemplazar contenido de bdd existente 
@Rollback(false)
public class BddTest {
    
    @Autowired //comunicación entre clase BDDTest y ProductoDAO
    private ProductsDAO productDAO;
    
    /* @Autowired
    private OrdersDAO orderDAO;
    */
    
    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void test(){

    }
}
