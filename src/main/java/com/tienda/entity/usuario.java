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
@Table(name="usuarios")

public class usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    public Long id;
    public String nick;
    public String pwd;
    public String nombre;
    public String apellido;
    public String telefono;
    public String correo;
    
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
    
    public void setid(Long id){
        this.id =id;
    }
    public void setnick(String nick){
        this.nick=nick;
    }
    public void setpwd(String pwd){
        this.pwd=pwd;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
        public void setapellido(String apellido){
        this.apellido=apellido;
    }
    public void settelefono(String telefono){
        this.telefono=telefono;
    }
    public void setcorreo(String correo){
        this.correo=correo;
    }
    public void setrol(rol rol){
        this.rol=rol;
    }

    public Long getid(){
        return id;
    }
    public String getnick(){
        return nick;
    }
    public String getpwd(){
        return pwd;
    }
    public String getnombre(){
        return nombre;
    }
    public String getapellido(){
        return apellido;
    }
    public String gettelefono(){
        return telefono;
    }
    public String getcorreo(){
        return correo;
    }
    public rol getrol(){
        return rol;
    } 
    
    /*public List<String> getRoleList(){
        if(this.rol.length() > 0){
            return Arrays.asList(this.rol.split(","));
        }
        return new ArrayList<>();
    }*/
    
}
