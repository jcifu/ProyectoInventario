
package com.example.proyectoInventario.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author jacif
 */
@Data
@Entity
@Table(name="`employees`")
public class Employees implements Serializable {
    @Id
    @Column////(name = "employeenumber")
    private Integer employeeNumber;
    
    @Column////(name = "`lastname`")
    private String lastName;
    
    @Column////(name = "`firstname`")
    private String firstName;
    
    @Column//(name = "`extension`")
    private String extension;
    
    @Column//(name = "`email`")
    private String email;
    
    @Column//(name = "`officecode`")
    private String officeCode;
    
    @Column//(name = "`reportsto`")
    private int reportsTo;
    
    @Column//(name = "`jobtitle`")
    private String jobTitle;
    
    //Revisar
    
    //Empleados reportan a jefatura
    @ManyToOne
    @JoinColumn(name= "`reportsTo`", insertable = false, updatable = false) 
    private Employees employeeHead;
    
    //Empleados pertenecen a una oficina
    @ManyToOne
    @JoinColumn(name="`officeCode`", insertable = false, updatable = false) // antes: name= "idOfficeCode"
    private Offices offices;  
}
