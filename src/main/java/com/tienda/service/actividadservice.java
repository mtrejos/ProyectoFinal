package com.tienda.service;
import com.tienda.domain.actividad;
import java.util.List;

public interface actividadservice {
    public List<actividad> getActividad();
    
    public void save(actividad actividad);
    
    public void delete(actividad actividad);
    
    public actividad getActividad(actividad actividad);
}
