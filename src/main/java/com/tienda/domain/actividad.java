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
@Table(name="actividades")

public class actividad implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    public Long id;
    private String nombre;
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name="parque")
    private parque parque;
    
    @ManyToOne
    @JoinColumn(name="estatu")
    private estatu estatu;

    public actividad() {
    }

    public actividad(Long id, String nombre, String descripcion, parque parque, estatu estatu) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.parque = parque;
        this.estatu = estatu;
    }
   
}
