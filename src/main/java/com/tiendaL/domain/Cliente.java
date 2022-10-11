package com.tiendaL.domain;

import javax.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="cliente")

public class Cliente {

    private static final long serialVersionUID = 1L;
    
    private Long idCliente;//hibernate lo pasa a id_cliente
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)        
    String nombre;
    String apellidos;
    String correo;
    String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;

    }

    public Cliente(String luis_Mendez, String luisfidecom, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
