package com.tienda.service;
import com.tienda.domain.parque;
import java.util.List;

public interface parqueservice {
    public List<parque> getParque();
    
    public void save(parque parque);
    
    public void delete(parque parque);
    
    public parque getParque(parque parque);
}
