package com.tienda.service;

import com.tienda.dao.roldao;
import com.tienda.dao.usuariodao;
import com.tienda.entity.rol;
import com.tienda.entity.usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class usuarioserviceimpl implements usuarioservice {

    @Autowired
    private usuariodao usuariodao;
    
    @Override
    @Transactional(readOnly = true)
    public List<usuario> getUsuario() {
        return (List<usuario>) usuariodao.findAll();
    }

    @Override
    @Transactional
    public void save(usuario usuario) {
        usuariodao.save(usuario);
    }

    @Override
    @Transactional
    public void delete(usuario usuario) {
        usuariodao.delete(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public usuario getUsuario(usuario usuario) {
        return usuariodao.findById(usuario.id).orElse(null); //En el video tenian .getIdCliente que para nosotros seria getIdUsuario
    }
    
    @Override
    public usuario findByNick(String nick) {
        return usuariodao.findByNick(nick);
    }    
    
}
