package com.tiendaL.controller;

import com.tiendaL.domain.Articulo;
import com.tiendaL.service.ArticuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    private ArticuloService ArticuloService;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora se usa arquitectura MVC");
        //var articulos = ArticuloService.getArticulo(true);
        //var articulos = ArticuloService.getPorExistencias(5);
        var articulos = ArticuloService.getPorExistenciasCategorias(5, new Long(1));
        model.addAttribute("articulos", articulos);
        return "index";
    }
/*
    @GetMapping("/nuevoArticulo")
    public String nuevoArticulo(Articulo articulo) {
        return "modificarArticulo";
    }

    @PostMapping("/guardarArticulo")
    public String guardarArticulo(Articulo articulo) {
        ArticuloService.save(articulo);
        return "redirect:/";
    }

    @GetMapping("/modificarArticulo/{idArticulo}")
     public String modificarArticulo(Articulo articulo, Model model){
     articulo = ArticuloService.getArticulos(articulo);
     model.addAttribute("articulo", articulo);
     return "modificarArticulo";
     
     }
    
     @GetMapping("/eliminarArticulo/{idArticulo}")
     public String eliminarArticulo(Articulo articulo){
     ArticuloService.delete(articulo);
     return "redirect:/";
     }
*/
}
