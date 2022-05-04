package com.tienda.controller;

import com.tienda.entity.actividad;
import com.tienda.entity.usuario;
import com.tienda.entity.venta;
import com.tienda.service.actividadservice;
import com.tienda.service.usuarioservice;
import com.tienda.service.ventaservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ventaController {
    @Autowired
    private actividadservice actividadservice;
    @Autowired
    private ventaservice ventaservice;
    @Autowired
    private usuarioservice usuarioservice;

    @GetMapping("/ventas/lista")
    public String listventas(Model model){
        var List = ventaservice.getVenta();
        model.addAttribute("ventas",List);
        return "/ventas/lista";
    }
    
    @GetMapping("/usuarios/comprar/{id}")
    public String comprarusuario(usuario usuario, venta venta, Model model){
        var data = usuarioservice.getUsuario(usuario);
        var List = actividadservice.getActividad();
        model.addAttribute("actividades",List);
        model.addAttribute("usuario",data);
        return "/usuarios/comprar";
    }
    
    @GetMapping("/actividades/vender/{id}")
    public String venderactividad(actividad actividad, venta venta, Model model){
        var data = usuarioservice.getUsuario();
        var List = actividadservice.getActividad(actividad);
        model.addAttribute("actividades",List);
        model.addAttribute("usuario",data);
        return "/actividades/vender";
    }
    
    @PostMapping("/ventas/venta")
    public String venta(venta venta){
        ventaservice.save(venta);
        return "redirect:/";
    }
    
}