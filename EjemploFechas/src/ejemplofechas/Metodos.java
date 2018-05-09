/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofechas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author quique
 */
public class Metodos {

    TrabajadorDate t1 = new TrabajadorDate();

    public void establecerFechaAlta() {
        t1.setFechadealta(new Date(115, 03, 02));

        System.out.println(t1.getFechadealta());
    }

    public void establecerFechaBaja() {
        t1.setFechadebaja(new Date());

        System.out.println(t1.getFechadebaja());
    }

    public void tiempoEntreFechas() {
        System.out.println("Diferencia entre las dos fechas: " + (t1.getFechadebaja().getTime() - t1.getFechadealta().getTime()) / (1000.0 * 3600 * 24 * 365) + " años.");
    }

    public void tiempoHastaHoy() {

        Date fecha = new Date();

        System.out.println("Años de antiguedad: " + (fecha.getYear() - t1.getFechadealta().getYear()));
    }

    //****TIME****
    TrabajadorTime t2 = new TrabajadorTime();
    LocalDate alta;
    LocalDate baja;

    public void fechaAltaTime() {
        alta = LocalDate.of(2015, Month.MARCH, 2);
        t2.setFechadealta(alta);

        System.out.println(t2.getFechadealta());
    }

    public void fechaBajaTime() {
        baja = LocalDate.now();
        t2.setFechadebaja(baja);
        
        System.out.println(t2.getFechadebaja());

    }
    
    public void tiempoEntreFechasTime(){   
        Period periodo = Period.between(t2.getFechadealta(), t2.getFechadebaja());        
        System.out.println("Tiempo entre fechas: "+periodo.getYears()+" años, "+periodo.getMonths()+" meses, "+periodo.getDays()+" días ");
        
    }
    

}
