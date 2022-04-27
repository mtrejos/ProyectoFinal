package com.tienda.service;

import com.tienda.dao.estatudao;
import com.tienda.domain.estatu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class estatuserviceimpl implements estatuservice {

    @Autowired
    private estatudao estatudao;
    
    @Override
    @Transactional(readOnly = true)
    public List<estatu> getEstatu() {
        return (List<estatu>) estatudao.findAll();
    }

    @Override
    @Transactional
    public void save(estatu estatu) {
        estatudao.save(estatu);
    }

    @Override
    @Transactional
    public void delete(estatu estatu) {
        estatudao.delete(estatu);
    }

    @Override
    @Transactional(readOnly = true)
    public estatu getEstatu(estatu estatu) {
        return estatudao.findById(estatu.id).orElse(null); //En el video tenian .getIdCliente que para nosotros seria getIdestatu
    }
    
}
