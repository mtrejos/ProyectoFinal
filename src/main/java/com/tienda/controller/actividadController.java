package com.tienda.controller;

import com.tienda.domain.actividad;
import com.tienda.service.actividadservice;
import com.tienda.service.estatuservice;
import com.tienda.service.parqueservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class actividadController {
    @Autowired
    private actividadservice actividadservice;
    @Autowired
    private estatuservice estatuservice;
    @Autowired
    private parqueservice parqueservice;
    
    @GetMapping("/actividades/lista")
    public String adminactividad(Model model){
        var List = actividadservice.getActividad();
        model.addAttribute("actividades",List);
        return "/actividades/lista";
    }
    
    @GetMapping("/actividades/registrar")
    public String nuevoactividad(actividad actividad, Model model){
        var estatus = estatuservice.getEstatu();
        var parques = parqueservice.getParque();
        model.addAttribute("parques",parques);
        model.addAttribute("estatus",estatus);
        return "/actividades/editar";
    }
    
    @GetMapping("/actividades/modificar/{id}")
    public String modificaractividad(actividad actividad, Model model){
        var data = actividadservice.getActividad(actividad);
        var estatus = estatuservice.getEstatu();
        var parques = parqueservice.getParque();
        model.addAttribute("parques",parques);
        model.addAttribute("actividad",data);
        model.addAttribute("estatus",estatus);
        return "/actividades/editar";
    }
    
    @PostMapping("/actividades/guardar")
    public String guardaractividad(actividad actividad){
        actividadservice.save(actividad);
        return "redirect:/actividades/lista";
    }
    
    @GetMapping("/actividades/eliminar/{id}")
    public String eliminaractividad(actividad actividad){
        actividadservice.delete(actividad);
        return "redirect:/actividades/lista";
    }
}