package com.tienda.service;
import com.tienda.entity.venta;
import java.util.List;

public interface ventaservice {
    public List<venta> getVenta();
    
    public void save(venta venta);
    
    public void delete(venta venta);
    
    public venta getVenta(venta venta);
}
