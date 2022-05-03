package com.tienda.dao;

import com.tienda.entity.parque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface parquedao extends JpaRepository<parque,Long>{
    
}
