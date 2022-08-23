package com.egg.EggNews3.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
    
    @Id
    private String dni; 
    private String nombre;

    public Usuario() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    
}
