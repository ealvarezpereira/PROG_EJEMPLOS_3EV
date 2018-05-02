/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplolambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 *
 * @author quique
 */
public class Persona {
    
    
    private String nombre, apellido, direccion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    Supplier<Persona> pers;
    
    public void crear(){
    
        pers = () -> {return( new Persona("Pepita","Perez","Urzaiz"));};
        
        System.out.println(pers.get());
    } 
    
    public void ver(){
    
        Consumer <Persona> perRecibida = (p) -> {
            System.out.println(pers.get());
        };
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Direccion: " + direccion;
    }
    
    
}
