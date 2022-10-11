
package com.tiendaL.dao;

import com.tiendaL.domain.Cliente;
import lombok.extern.java.Log;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository <Cliente, Log> {
    
}
