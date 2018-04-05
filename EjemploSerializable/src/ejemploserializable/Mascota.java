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
public class Mascota implements Serializable {
    
    
    private String nombre;
    private int numPatas;

    public Mascota() {
    }

    public Mascota(String nombre, int numPatas) {
        this.nombre = nombre;
        this.numPatas = numPatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", numPatas=" + numPatas + '}';
    }
    
    
   
}
