
package com.tiendaL.service;

import com.tiendaL.domain.Articulo;
import java.util.List;

public interface ArticuloService {
    
   public List<Articulo> getArticulo (boolean activos);
    
    public void save (Articulo articulo);
    
    public void delete (Articulo articulo);
    
    public Articulo getArticulo (Articulo articulo); 
}
