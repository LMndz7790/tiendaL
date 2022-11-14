
package com.tiendaL.controller;

import com.tiendaL.domain.Cliente;
import com.tiendaL.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ClienteController {

     @Autowired
    private ClienteService ClienteService;

    @GetMapping("/cliente/listado")
    public String inicio(Model model) {
        var clientes = ClienteService.getClientes();
        model.addAttribute("clientes", clientes);
        return "/cliente/listado";
    }
     @GetMapping("/cliente/nuevo")
    public String nuevoCliente(Cliente cliente) {
        return "cliente/modificar";
    }

    @PostMapping("/cliente/guardar")
    public String guardarCliente(Cliente cliente) {
        ClienteService.save(cliente);
        return "redirect:/cliente/listado";
    }

    @GetMapping("/cliente/modificar/{idCliente}")
     public String modificarCliente(Cliente cliente, Model model){
     cliente = ClienteService.getClientes(cliente);
     model.addAttribute("cliente", cliente);
     return "cliente/modificar";
     
     }
    
     @GetMapping("/cliente/eliminar/{idCliente}")
     public String eliminarCliente(Cliente cliente){
     ClienteService.delete(cliente);
     return "redirect:/cliente/listado";
     }
    
}

