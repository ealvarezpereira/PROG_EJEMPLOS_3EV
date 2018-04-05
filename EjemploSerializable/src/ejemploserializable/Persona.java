/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploserializable;

import java.io.Serializable;

/**
 *
 * @author quique
 */
public class Persona implements Serializable {

    private String nombre, apellido;
    private int edad;
    private Mascota mas = new Mascota();

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String nMas, int numPatas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        mas.setNombre(nMas);
        mas.setNumPatas(numPatas);
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Mascota getMas() {
        return mas;
    }

    public void setMas(Mascota mas) {
        this.mas = mas;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", mas=" + mas;
    }

}
