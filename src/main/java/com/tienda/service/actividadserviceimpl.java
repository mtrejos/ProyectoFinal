package com.tienda.service;

import com.tienda.dao.actividaddao;
import com.tienda.domain.actividad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class actividadserviceimpl implements actividadservice {

    @Autowired
    private actividaddao actividaddao;
    
    @Override
    @Transactional(readOnly = true)
    public List<actividad> getActividad() {
        return (List<actividad>) actividaddao.findAll();
    }

    @Override
    @Transactional
    public void save(actividad actividad) {
        actividaddao.save(actividad);
    }

    @Override
    @Transactional
    public void delete(actividad actividad) {
        actividaddao.delete(actividad);
    }

    @Override
    @Transactional(readOnly = true)
    public actividad getActividad(actividad actividad) {
        return actividaddao.findById(actividad.id).orElse(null); //En el video tenian .getIdCliente que para nosotros seria getIdactividad
    }
    
}
