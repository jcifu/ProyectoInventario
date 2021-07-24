
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
@Table(name = "`products`")
public class Products implements Serializable {
    @Id
    @Column//(name = "`productCode`")
    private String productCode;
   
    @Column//(name = "`productName`")
    private String productName;
    
    @Column//(name = "`productLine`")
    private String productLine;
    
    @Column//(name = "`productScale`")
    private String productScale;
    
    @Column//(name = "`productVendor`")
    private String productVendor;
    
    @Column//(name = "`productDescription`")
    private String productDescription;
    
    @Column//(name = "`quantityInStock`")
    private int quantityInStock;
    
    @Column//(name = "`buyPrice`")
    private double buyPrice;
    
    @Column//(name = "`msrp`")
    private double msrp; 
   
    @ManyToOne
    @JoinColumn(name= "`productLine`", insertable = false, updatable = false)
    private ProductLines productLines;
    
}
