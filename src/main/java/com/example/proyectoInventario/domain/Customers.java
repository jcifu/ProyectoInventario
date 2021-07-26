
package com.example.proyectoInventario.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
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
@Table(name= "`customers`")
public class Customers implements Serializable {
    @Id
    @Column//(name = "`customernumber`")
    private Integer customerNumber;
    
    @Column//(name = "`customername`")
    private String customerName;
    
    @Column//(name = "`contactlastname`")
    private String contactLastName;
    
    @Column//(name= "`contactfirstname`")
    private String contactFirstName;
    
    @Column//(name = "`phone`")
    private String phone;
    
    @Column//(name = "`addressline1`")
    private String addressLine1;
    
    @Column//(name = "`addressline2`")
    private String addressLine2;
    
    @Column//(name = "`city`")
    private String city;
    
    @Column//(name = "`state`")
    private String state;
    
    @Column//(name = "`postalcode`")
    private String postalCode;
    
    @Column//(name = "`country`")
    private String country;
    
    @Column//(name = "`salesrepemployeenumber`")
    private Integer salesRepEmployeeNumber;
    
    @Column//(name = "`creditlimit`")
    private double creditLimit;
  
    // Un empleado (Employees) puede tener muchos clientes bajo su responsabilidad (salesRepEmployeeNumber)
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="salesRepEmployeeNumber", referencedColumnName = "employeeNumber", insertable = false, updatable = false) //qué pasa con la columna salesRepEmployeeNumber? buscar variables de anotacion
    private Employees employees;
    
}
