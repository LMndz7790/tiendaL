
package com.tiendaL.service;

import com.tiendaL.domain.Cliente;
import java.util.List;

public interface ClienteService {
    
   public List<Cliente> getClientes ();
    
    public void save (Cliente cliente);
    
    public void delete (Cliente cliente);
    
    public Cliente getClientes (Cliente cliente); 
}
