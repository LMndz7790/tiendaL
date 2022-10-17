package com.tiendaL.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="cliente")

public class Cliente implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private Long idCliente;//hibernate lo pasa a id_cliente
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)        
    Long idcliente;
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
