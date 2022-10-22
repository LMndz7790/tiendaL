package com.tiendaL.controller;

import com.tiendaL.domain.Cliente;
import com.tiendaL.service.ClienteService;
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
    private ClienteService ClienteService;

    @GetMapping("/")
    public String inicio(Model model) {

        log.info("Ahora se usa arquitectura MVC");

        Cliente cliente = new Cliente("Luis Mendez", "luis@fide.com", "8888-0000");
        //Cliente cliente2 = new Cliente ("Luis Blanco", "luis@fide.com", "8888-0000");

        //var clientes= Arrays.asList(cliente);
        var clientes = ClienteService.getClientes();

        model.addAttribute("clientes", clientes);
        return "index";
    }

    @GetMapping("/nuevoCliente")
    public String nuevoCliente(Cliente cliente) {
        return "modificarCliente";
    }

    @PostMapping("/guardarCliente")
    public String guardarCliente(Cliente cliente) {
        ClienteService.save(cliente);
        return "redirect:/";
    }

    @GetMapping("/modificarCliente/{idCliente}")
     public String modificarCliente(Cliente cliente, Model model){
     cliente = ClienteService.getClientes(cliente);
     model.addAttribute("cliente", cliente);
     return "modificarCliente";
     
     }
    
     @GetMapping("/eliminarCliente/{idCliente}")
     public String eliminarCliente(Cliente cliente){
     ClienteService.delete(cliente);
     return "redirect:/";
     }
}
