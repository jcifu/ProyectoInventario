
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
@Table(name = "`payments`")
public class Payments implements Serializable {
    @Id
    @Column//(name = "`customerNumber`")
    private Integer customerNumber;
    
    @Column//(name = "`checkNumber`")
    private String checkNumber;
    
    @Column//(name = "`paymentDate`")
    private String paymentDate;
    
    @Column//(name = "`amount`")
    private double amount;
    
    @ManyToOne
    @JoinColumn(name="`customerNumber`", insertable = false, updatable = false) //antes id_customerNumber
    private Customers customers;
    
}
