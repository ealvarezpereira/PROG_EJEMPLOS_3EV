/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostream;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class EjemploStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        UsoStreams use = new UsoStreams();

        int op = Integer.parseInt(JOptionPane.showInputDialog("***MENU***"
                + "\n1.- Añadir alumno"
                + "\n2.- Mostrar Alumnos"
                + "\n3.- Mostrar Alumno determinado"
                + "\n4.- Alumnos aprobados"
                + "\n5.- Listado suspensos"
                + "\n6.- Mostrar suspensos"
                + "\n7.- Mostrar por DNI"
                + "\n8.- Mayor nota"
                + "\n9.- Ordenar por nombre"
                + "\n10.- Subir nota"));

        while (op != 0) {

            switch (op) {

                case 0:
                    System.exit(0);
                    break;
                case 1:
                    use.crearLista();
                    break;
                case 2:
                    use.mostrar();
                    break;
                case 3:
                    use.mostrarAlDeterminado();
                    break;
                case 4:
                    use.aprobados();
                    break;
                case 5:
                    use.listadoSuspensos();
                    break;
                case 6:
                    use.mostrarSuspensos();
                    break;
                case 7:
                    use.buscarAlumno();
                    break;
                case 8:
                    use.mayorNota();
                    break;
                case 9:
                    use.ordenarporNombre();
                    break;
                case 10:
                    use.aumentarNota();
                    break;

                default:
                    System.out.println("Error");
            }

            op = Integer.parseInt(JOptionPane.showInputDialog("***MENU***"
                    + "\n1.- Añadir alumno"
                    + "\n2.- Mostrar Alumnos"
                    + "\n3.- Mostrar Alumno determinado"
                    + "\n4.- Alumnos aprobados"
                    + "\n5.- Listar suspensos\n6.- Mostrar suspensos"
                    + "\n7.- Mostrar por DNI"
                    + "\n8.- Mayor nota"
                    + "\n9.- Ordenar por nombre"
                    + "\n10.- Subir nota"));
        }
    }

}
