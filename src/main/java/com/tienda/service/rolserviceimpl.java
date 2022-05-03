package com.tienda.service;

import com.tienda.dao.roldao;
import com.tienda.entity.rol;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class rolserviceimpl implements rolservice {

    @Autowired
    private roldao roldao;
    
    @Override
    @Transactional(readOnly = true)
    public List<rol> getRol() {
        return (List<rol>) roldao.findAll();
    }

    @Override
    @Transactional
    public void save(rol rol) {
        roldao.save(rol);
    }

    @Override
    @Transactional
    public void delete(rol rol) {
        roldao.delete(rol);
    }

    @Override
    @Transactional(readOnly = true)
    public rol getRol(rol rol) {
        return roldao.findById(rol.id).orElse(null); //En el video tenian .getIdCliente que para nosotros seria getIdrol
    }
    
}
