package com.tienda.service;
import com.tienda.domain.usuario;
import java.util.List;

public interface usuarioservice {
    public List<usuario> getUsuario();
    
    public void save(usuario usuario);
    
    public void delete(usuario usuario);
    
    public usuario getUsuario(usuario usuario);
}
