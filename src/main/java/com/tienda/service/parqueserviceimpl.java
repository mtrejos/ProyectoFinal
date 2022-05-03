package com.tienda.service;

import com.tienda.dao.parquedao;
import com.tienda.entity.parque;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class parqueserviceimpl implements parqueservice {

    @Autowired
    private parquedao parquedao;
    
    @Override
    @Transactional(readOnly = true)
    public List<parque> getParque() {
        return (List<parque>) parquedao.findAll();
    }

    @Override
    @Transactional
    public void save(parque parque) {
        parquedao.save(parque);
    }

    @Override
    @Transactional
    public void delete(parque parque) {
        parquedao.delete(parque);
    }

    @Override
    @Transactional(readOnly = true)
    public parque getParque(parque parque) {
        return parquedao.findById(parque.id).orElse(null); //En el video tenian .getIdCliente que para nosotros seria getIdparque
    }

    
}
