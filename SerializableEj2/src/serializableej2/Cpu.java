/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializableej2;

import java.io.Serializable;

/**
 *
 * @author quique
 */
public class Cpu implements Serializable{
    
      private int velocidad;
    private int memoria;

    public Cpu() {
    }

    public Cpu(int velocidad, int memoria) {
        this.velocidad = velocidad;
        this.memoria = memoria;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Velocidad = " + velocidad + ", Memoria = " + memoria;
    }

}
