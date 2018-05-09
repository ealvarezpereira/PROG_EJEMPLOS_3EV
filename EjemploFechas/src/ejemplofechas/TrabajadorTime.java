/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofechas;

import java.time.LocalDate;

/**
 *
 * @author quique
 */
public class TrabajadorTime {
     private String nombre;
    private LocalDate fechadealta;
    private LocalDate fechadebaja;

    public TrabajadorTime(String nombre, LocalDate fechadealta, LocalDate fechadebaja) {
        this.nombre = nombre;
        this.fechadealta = fechadealta;
        this.fechadebaja = fechadebaja;
    }

    public TrabajadorTime() {
    }

    public String getNombre() {
        
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechadealta() {
        return fechadealta;
    }

    public void setFechadealta(LocalDate fechadealta) {
        this.fechadealta = fechadealta;
    }

    public LocalDate getFechadebaja() {
        return fechadebaja;
    }

    public void setFechadebaja(LocalDate fechadebaja) {
        this.fechadebaja = fechadebaja;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + ", Fecha de alta: " + fechadealta + ", Fecha de baja: " + fechadebaja;
    }
    
}
