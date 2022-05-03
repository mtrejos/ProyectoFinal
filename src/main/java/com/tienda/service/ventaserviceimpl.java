package com.tienda.service;

import com.tienda.dao.ventadao;
import com.tienda.entity.venta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ventaserviceimpl implements ventaservice {

    @Autowired
    private ventadao ventadao;
    
    @Override
    @Transactional(readOnly = true)
    public List<venta> getVenta() {
        return (List<venta>) ventadao.findAll();
    }

    @Override
    @Transactional
    public void save(venta venta) {
        ventadao.save(venta);
    }

    @Override
    @Transactional
    public void delete(venta venta) {
        ventadao.delete(venta);
    }

    @Override
    @Transactional(readOnly = true)
    public venta getVenta(venta venta) {
        return ventadao.findById(venta.idVentas).orElse(null); //En el video tenian .getIdCliente que para nosotros seria getIdventa
    }
    
}
