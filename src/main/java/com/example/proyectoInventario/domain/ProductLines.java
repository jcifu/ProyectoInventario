
package com.example.proyectoInventario.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author jacif
 */
@Data
@Entity
@Table(name = "`productLines`")
public class ProductLines implements Serializable {
    @Id
    @Column//(name = "`productLine`")
    private String productLine;
    
    @Column//(name = "`textDescription`")
    private String textDescription;
    
    @Column//(name = "`htmlDescription`")
    private String htmlDescription;
    
    @Column//(name = "`image`")
    private String image; //verificar 
}
