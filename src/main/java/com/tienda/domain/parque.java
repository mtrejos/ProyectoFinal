package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="parques")

public class parque implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    public Long id;
    private String nombre;

    @ManyToOne
    @JoinColumn(name="estatu")
    private estatu estatu;
    
    public parque() {
    }

    public parque(Long id, String nombre, estatu estatu) {
        this.id = id;
        this.nombre = nombre;
        this.estatu = estatu;
    }
   
}
