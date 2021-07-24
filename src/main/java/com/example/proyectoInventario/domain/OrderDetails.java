
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
@Table(name = "`orderDetails`")
public class OrderDetails implements Serializable {
    @Id
    @Column//(name = "`orderNumber`")
    private Integer orderNumber;
    
    @Column//(name = "`productCode`")
    private String productCode;
    
    @Column//(name = "`quantityOrdered`")
    private String quantityOrdered;
    
    @Column//(name = "`priceEach`")
    private double priceEach;
    
    @Column//(name = "`orderLineNumber`")
    private int orderLineNumber;
    
    //Una orden de compra puede tener muchos detalles
    @ManyToOne
    @JoinColumn(name="`orderNumber`", insertable = false, updatable = false) //antes id_OrderNumber
    private Orders orders;
    
    // Un producto (Products) puede estar en muchos detalles de ordenes //(orderDetails)
    @ManyToOne
    @JoinColumn(name= "`productCode`", insertable = false, updatable = false) //antes id_productCode
    private Products products;
}
