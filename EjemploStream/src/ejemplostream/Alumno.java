/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostream;

/**
 *
 * @author quique
 */
public class Alumno {
    
    private String dni,nombre,curso;
    
    private int nota;

    public Alumno() {
    }

    public Alumno(String dni, String nombre, String curso, int nota) {
        this.dni = dni;
        this.nombre = nombre;
        this.curso = curso;
        this.nota = nota;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre + ", Curso: " + curso + ", Nota: " + nota;
    }
    
    
}
