/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofechas;

import java.util.Date;

/**
 *
 * @author quique
 */
public class TrabajadorDate {
    
    private String nombre;
    private Date fechadealta;
    private Date fechadebaja;

    public TrabajadorDate(String nombre, Date fechadealta, Date fechadebaja) {
        this.nombre = nombre;
        this.fechadealta = fechadealta;
        this.fechadebaja = fechadebaja;
    }

    public TrabajadorDate() {
    }

    public String getNombre() {
        
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechadealta() {
        return fechadealta;
    }

    public void setFechadealta(Date fechadealta) {
        this.fechadealta = fechadealta;
    }

    public Date getFechadebaja() {
        return fechadebaja;
    }

    public void setFechadebaja(Date fechadebaja) {
        this.fechadebaja = fechadebaja;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + ", Fecha de alta: " + fechadealta + ", Fecha de baja: " + fechadebaja;
    }
    
    
    
}
