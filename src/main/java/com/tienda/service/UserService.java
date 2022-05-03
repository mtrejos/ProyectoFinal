package com.tienda.service;

import com.tienda.entity.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService{
    
    @Autowired
    public usuarioservice usuarioservice;
    
    @Override
    public UserDetails loadUserByUsername(String nick) throws UsernameNotFoundException{
        usuario usuario = this.usuarioservice.findByNick(nick);
        Userprincipal userprincipal = new Userprincipal(usuario);
        return userprincipal;
    }
}
