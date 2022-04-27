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
@Table(name="usuarios")

public class usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    public Long id;
    private String nick;
    private String pwd;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    
    @ManyToOne
    @JoinColumn(name="rol")
    private rol rol;
    
    
    public usuario() {
    }
    
    public usuario(Long id, String nick, String pwd, String nombre, String apellido, String telefono, String correo, rol rol) {
        this.id = id;
        this.nick = nick;
        this.pwd = pwd;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.rol = rol;
    }
    
}
