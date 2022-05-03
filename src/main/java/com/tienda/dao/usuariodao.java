package com.tienda.dao;

import com.tienda.entity.usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuariodao extends JpaRepository<usuario, Long>{

    public usuario findByNick(String nick);
}
