
package com.tiendaL.controller;

import com.tiendaL.domain.Articulo;
import com.tiendaL.service.ArticuloService;
import com.tiendaL.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ArticuloController {

     @Autowired
    private ArticuloService ArticuloService;
     
     @Autowired
     private CategoriaService categoriaService;

    @GetMapping("/articulo/listado")
    public String inicio(Model model) {
        var articulos = ArticuloService.getArticulo(false);
        model.addAttribute("articulos", articulos);
        return "/articulo/listado";
    }
     @GetMapping("/articulo/nuevo")
    public String nuevoArticulo(Articulo articulo, Model model) {
        var categorias = categoriaService.getCategoria(true);
        model.addAttribute("categorias", categorias);
        return "articulo/modificar";
    }

    @PostMapping("/articulo/guardar")
    public String guardarArticulo(Articulo articulo) {
        ArticuloService.save(articulo);
        return "redirect:/articulo/listado";
    }

    @GetMapping("/articulo/modificar/{idArticulo}")
     public String modificarArticulo(Articulo articulo, Model model){
         var categorias = categoriaService.getCategoria(true);
        model.addAttribute("categorias", categorias);
     articulo = ArticuloService.getArticulo(articulo);
     model.addAttribute("articulo", articulo);
     return "articulo/modificar";
     
     }
    
     @GetMapping("/articulo/eliminar/{idArticulo}")
     public String eliminarArticulo(Articulo articulo){
     ArticuloService.delete(articulo);
     return "redirect:/articulo/listado";
     }
    
}

