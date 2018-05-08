/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostream;

import static datos.PedirDatos.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class UsoStreams {
    
    List<Alumno> listaAlumnos = new ArrayList();
    List<Alumno> suspensos = new ArrayList();
    
    public void crearLista() {
//        for (int i = 0; i < 2; i++) {
//            listaAlumnos.add(new Alumno(readString(), readString(), readString(), readInt()));
//        }

        listaAlumnos.add(new Alumno("111", "Ana", "dam1", 4));
        listaAlumnos.add(new Alumno("222", "Pepe", "dam2", 8));
        listaAlumnos.add(new Alumno("333", "Juan", "dam1", 6));
        listaAlumnos.add(new Alumno("444", "Alex", "dam1", 5));
        listaAlumnos.add(new Alumno("555", "Miriam", "dam2", 3));
        listaAlumnos.add(new Alumno("666", "Quique", "dam1", 7));
    }
    
    public void mostrar() {
//        for(Alumno al:listaAlumnos){
//            JOptionPane.showMessageDialog(null,al);
//        }       
        listaAlumnos.stream().forEach(al -> JOptionPane.showMessageDialog(null, al));
    }
    
    public void mostrarAlDeterminado() {
        
        String primeraletra = readString();

        //Stream -> Operacion de entrada
        //Filter -> Operacion intermedia
        //forEach -> Operacion de salida
        listaAlumnos.stream().filter(al -> al.getNombre().startsWith(primeraletra)).forEach(al -> JOptionPane.showMessageDialog(null, al));
    }
    
    public void aprobados() {
        listaAlumnos.stream().filter(al -> al.getNota() >= 5).forEach(al -> JOptionPane.showMessageDialog(null, al));
    }
    
    public void listadoSuspensos() {
        listaAlumnos.stream().filter(al -> al.getNota() < 5).forEach(al -> suspensos.add(al));
        //suspensos = listaAlumnos.stream().filter(al -> al.getNota()<5).collect(Collectors.toList());
    }
    
    public void mostrarSuspensos() {
        suspensos.stream().forEach(al -> JOptionPane.showMessageDialog(null, al));
    }
    
    public void buscarAlumno() {
        String dni = readString();
        listaAlumnos.stream().filter(al -> al.getDni().equalsIgnoreCase(dni)).forEach(al -> JOptionPane.showMessageDialog(null, al));
    }
    
    public void mayorNota() {
        JOptionPane.showMessageDialog(null, listaAlumnos.stream().max(Comparator.comparing(al -> al.getNota())).get());
    }
    
    public void ordenarporNombre() {
//        listaAlumnos.sort(Comparator.comparing(al -> al.getNombre()));
//        listaAlumnos.stream().forEach(al -> JOptionPane.showMessageDialog(null, al));
    }
    
    public void aumentarNota(){
    
        listaAlumnos.stream().filter(al -> al.getNota() >= 5).forEach(al -> al.setNota(al.getNota()+2));
    }
}
