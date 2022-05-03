package com.tienda.service;
import com.tienda.entity.rol;
import java.util.List;

public interface rolservice {
    public List<rol> getRol();
    
    public void save(rol rol);
    
    public void delete(rol rol);
    
    public rol getRol(rol rol);
}
