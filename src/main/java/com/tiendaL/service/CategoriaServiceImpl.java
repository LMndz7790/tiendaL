
package com.tiendaL.service;

import com.tiendaL.dao.CategoriaDao;
import com.tiendaL.domain.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service

public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    CategoriaDao categoriaDao;
    
    
    @Override
    public List<Categoria> getCategoria(boolean activos) { //false 
        var lista= (List<Categoria>) categoriaDao.findAll();  //4 = 2 A y 2 I
        
        if (activos){
        lista.removeIf(e -> e.isActivo());
        }
        
        return lista;//4 = 2 A y 2 I
    }

    @Override
    public Categoria getCategoria(Categoria categoria) {
       
        //return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
        return (Categoria) categoriaDao; 
    }

    @Override
    public void save(Categoria categoria) {  
    categoriaDao.save(categoria);
    
    }

    @Override
    public void delete(Categoria categoria) {
     categoriaDao.delete(categoria);
    
    }
    
}
