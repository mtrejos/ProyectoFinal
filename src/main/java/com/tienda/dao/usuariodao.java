package com.tienda.dao;

import com.tienda.domain.usuario;
import org.springframework.data.repository.CrudRepository;

public interface usuariodao extends CrudRepository<usuario, Long>{
    
}
