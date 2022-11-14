package com.tiendaL.dao;

import com.tiendaL.domain.Articulo;
import java.util.List;
import lombok.extern.java.Log;
import org.springframework.data.repository.CrudRepository;

public interface ArticuloDao extends CrudRepository <Articulo, Log>{
   
    List<Articulo> findByExistencias( int existencias);
    
    // este metodo es para buscar por dos caracteristicas and para decir por este y por este, o Or para indicar que se cumpla una de la sentencias sea X o Y.
    List<Articulo> findByExistenciasAndIdCategoria( int existencias, Long idCategoria); 

    
}
