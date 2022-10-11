
package com.tiendaL.controller;

import com.tiendaL.dao.ClienteDao;
import com.tiendaL.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {
   
    @Autowired
private ClienteDao clienteDao;

    @GetMapping("/")
    public String inicio(Model model) {
       
        log.info("Ahora se usa arquitectura MVC");
               
        Cliente cliente = new Cliente ("Luis Mendez", "luis@fide.com", "8888-0000");
        //Cliente cliente2 = new Cliente ("Luis Blanco", "luis@fide.com", "8888-0000");
        
        //var clientes= Arrays.asList(cliente);
        
        var clientes = clienteDao.findAll();
        
         model.addAttribute("cliente", cliente);
        
         model.addAttribute("clientes", clientes);
         
        return "index";
    }
    
}
