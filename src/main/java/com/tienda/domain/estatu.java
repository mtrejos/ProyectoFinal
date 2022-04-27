package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="estatus")

public class estatu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Long id;
    private String nombre;

    public estatu() {
    }

    public estatu(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }    
        
}
