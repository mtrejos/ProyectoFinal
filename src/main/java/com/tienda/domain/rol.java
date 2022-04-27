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
@Table(name="roles")

public class rol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public Long id;
    private String rol;

    public rol() {
    }

    public rol(Long id, String rol) {
        this.id = id;
        this.rol = rol;
    }
        
}
