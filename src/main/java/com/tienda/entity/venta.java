package com.tienda.entity;

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
@Table(name="ventas")

public class venta implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    public Long idVentas;
    public Long cantidad;
    
    @ManyToOne
    @JoinColumn(name="usuario")
    private usuario usuario;
    
    @ManyToOne
    @JoinColumn(name="actividad")
    private actividad actividad;

    public venta() {
    }

    public venta(Long idVentas, usuario usuario, actividad actividad, Long cantidad) {
        this.idVentas = idVentas;
        this.usuario = usuario;
        this.actividad = actividad;
        this.cantidad = cantidad;
    }

   
}
