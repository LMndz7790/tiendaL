
package com.tiendaL.service;

import com.tiendaL.dao.ArticuloDao;
import com.tiendaL.domain.Articulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service

public class ArticuloServiceImpl implements ArticuloService {

    @Autowired
    ArticuloDao articuloDao;
    
    
    @Override
    public List<Articulo> getArticulo(boolean activos) { //false 
        var lista= (List<Articulo>) articuloDao.findAll();  //4 = 2 A y 2 I
        
        if (activos){
        lista.removeIf(e -> e.isActivo());
        }
        
        return lista;//4 = 2 A y 2 I
    }

    @Override
    public Articulo getArticulo(Articulo articulo) {
       
        //return articuloDao.findById(articulo.getIdArticulo()).orElse(null);
        return (Articulo) articuloDao; 
    }

    @Override
    public void save(Articulo articulo) {  
    articuloDao.save(articulo);
    
    }

    @Override
    public void delete(Articulo articulo) {
     articuloDao.delete(articulo);
    
    }
    
}
