package com.tienda.service;

import com.tienda.entity.usuario;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class Userprincipal implements UserDetails{
    private final usuario usuario;
    
    public Userprincipal(usuario usuario){
        this.usuario = usuario;
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities(){
        List<GrantedAuthority> authorities = new ArrayList<>();
        var Rol = this.usuario.getrol();
        GrantedAuthority authority = new SimpleGrantedAuthority(Rol.rol);
        authorities.add(authority);
        /*
        this.usuario.getrol().forEach(p -> {
            GrantedAuthority authority = new SimpleGrantedAuthority(p);
            authorities.add(authority);});
        */
        return authorities;
    }
    
    @Override
    public String getPassword(){
        return this.usuario.getpwd();
    }
    
    @Override
    public String getUsername(){
        return this.usuario.getnick();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        // return this.usuario.getActive() = 1; //Si tuviera definida la columna usuario activa
        return true;
    }
}
