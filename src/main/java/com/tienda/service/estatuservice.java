package com.tienda.service;
import com.tienda.entity.estatu;
import java.util.List;

public interface estatuservice {
    public List<estatu> getEstatu();
    
    public void save(estatu estatu);
    
    public void delete(estatu estatu);
    
    public estatu getEstatu(estatu estatu);
}
