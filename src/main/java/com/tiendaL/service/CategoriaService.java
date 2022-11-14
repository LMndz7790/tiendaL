
package com.tiendaL.service;


import com.tiendaL.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    public List<Categoria> getCategoria (boolean activos);
    
    public Categoria getCategoria (Categoria categoria);
    
    public void save (Categoria categoria);
    
    public void delete (Categoria categoria);
    
    
    
}