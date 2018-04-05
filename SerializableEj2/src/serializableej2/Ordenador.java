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
public class Ordenador implements Serializable {
    
     private Cpu procesador;
    private Pantalla pantaia;
    private Raton ratita;

    public Ordenador(Cpu procesador, Pantalla pantaia, Raton ratita){

        this.procesador = procesador;
        this.pantaia = pantaia;
        this.ratita = ratita;
    }

    public Ordenador() {
        procesador = new Cpu();
        pantaia = new Pantalla();
        ratita = new Raton();
    }

    public Cpu getProcesador() {
        return procesador;
    }

    public void setProcesador(Cpu procesador) {
        this.procesador = procesador;
    }

    public Pantalla getPantaia() {
        return pantaia;
    }

    public void setPantaia(Pantalla pantaia) {
        this.pantaia = pantaia;
    }

    public Raton getRatita() {
        return ratita;
    }

    public void setRatita(Raton ratita) {
        this.ratita = ratita;
    }

    @Override
    public String toString() {
        return "Procesador: " + procesador + " Pantaia: " + pantaia + " Ratita: " + ratita;
    }
}
