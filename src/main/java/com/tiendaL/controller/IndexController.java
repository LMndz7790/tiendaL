
package com.tiendaL.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {
   
    @GetMapping("/")
    public String inicio(Model model) {
       
        log.info("Ahora se usa arquitectura MVC")
                
        Cliente cliente = new Cliente   ("Luis Mendez B.", "luis@fide.com", "8888-0000");
         model.addAttribute("cliente", cliente);
        
        return "index";
    }
    
}
