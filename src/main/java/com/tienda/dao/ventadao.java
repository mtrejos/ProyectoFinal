package com.tienda.dao;

import com.tienda.entity.venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ventadao extends JpaRepository<venta, Long>{
    
}
