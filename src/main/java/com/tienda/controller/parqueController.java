package com.tienda.controller;

import com.tienda.entity.parque;
import com.tienda.service.parqueservice;
import com.tienda.service.estatuservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class parqueController {
    @Autowired
    private parqueservice parqueservice;
    @Autowired
    private estatuservice estatuservice;
    
    @GetMapping("/parques/lista")
    public String adminparque(Model model){
        var List = parqueservice.getParque();
        model.addAttribute("parques",List);
        return "/parques/lista";
    }
    
    @GetMapping("/parques/registrar")
    public String nuevoparque(parque parque, Model model){
        var estatus = estatuservice.getEstatu();
        model.addAttribute("estatus",estatus);
        return "/parques/editar";
    }
    
    @GetMapping("/parques/modificar/{id}")
    public String modificarparque(parque parque, Model model){
        var data = parqueservice.getParque(parque);
        var estatus = estatuservice.getEstatu();
        model.addAttribute("estatus",estatus);
        model.addAttribute("parque",data);
        return "/parques/editar";
    }
    
    @PostMapping("/parques/guardar")
    public String guardarparque(parque parque){
        parqueservice.save(parque);
        return "redirect:/parques/lista";
    }
    
    @GetMapping("/parques/eliminar/{id}")
    public String eliminarparque(parque parque){
        parqueservice.delete(parque);
        return "redirect:/parques/lista";
    }
}