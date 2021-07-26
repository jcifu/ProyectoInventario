
package com.example.proyectoInventario.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;


/**
 *
 * @author jacif
 */

@Data
@Entity
@Table(name="orders")
public class Orders implements Serializable {
    @Id // id 
    @Column//(name = "`ordernumber`")
    private Integer orderNumber;
    
    @Column//(name = "`orderdate`")
    private String orderDate;
    
    @Column//(name = "`requireddate`")
    private String requiredDate;
    
    @Column//(name = "`shippeddate`")
        private String shippedDate;
    
    @Column//(name = "`status`")
    private String status;
    
    @Column(nullable = true)//(name="comments")
    private String comments;
    
    @Column//(name = "`customerNumber`")
    private Integer customerNumber;
 
   
    // Un cliente //(Customers) puede tener muchas ordenes de compra //(Orders)
    @ManyToOne
    @JoinColumn(name = "`customerNumber`", insertable = false, updatable = false)
    private Customers customers;
    
}