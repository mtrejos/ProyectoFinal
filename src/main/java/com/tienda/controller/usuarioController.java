package com.tienda.controller;

import com.tienda.domain.usuario;
import com.tienda.service.rolservice;
import com.tienda.service.usuarioservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class usuarioController {
    @Autowired
    private usuarioservice usuarioservice;
    @Autowired
    private rolservice rolservice;
    
    @GetMapping("/usuarios/lista")
    public String adminusuario(Model model){
        var List = usuarioservice.getUsuario();
        model.addAttribute("usuarios",List);
        return "/usuarios/lista";
    }
    
    @GetMapping("/usuarios/registrar")
    public String nuevousuario(usuario usuario, Model model){
        var roles = rolservice.getRol();
        model.addAttribute("roles",roles);
        return "/usuarios/editar";
    }
    
    @GetMapping("/usuarios/modificar/{id}")
    public String modificarusuario(usuario usuario, Model model){
        var data = usuarioservice.getUsuario(usuario);
        var roles = rolservice.getRol();
        model.addAttribute("roles",roles);
        model.addAttribute("usuario",data);
        return "/usuarios/editar";
    }
    
    @PostMapping("/usuarios/guardar")
    public String guardarusuario(usuario usuario){
        usuarioservice.save(usuario);
        return "redirect:/usuarios/lista";
    }
    
    @GetMapping("/usuarios/eliminar/{id}")
    public String eliminarusuario(usuario usuario){
        usuarioservice.delete(usuario);
        return "redirect:/usuarios/lista";
    }
}