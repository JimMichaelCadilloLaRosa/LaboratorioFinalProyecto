
package cl.programacion.avanzada.laboratorioFinal;

import cl.programacion.avanzada.excepciones.AccesoDatosEx;
import cl.programacion.avanzada.excepciones.LecturaDatosEx;
import cl.programacion.avanzada.negocio.CatalogoPeliculas;
import cl.programacion.avanzada.negocio.CatalogoPeliculasImpl;
import java.util.Locale;
import java.util.Scanner;
import vitas.Menu;

public class LaboratorioFinal {

    /*
    private static final Scanner scanner = new Scanner(System.in);
    private static final String nombreArchivo = "D:\\catalogoPeliculas\\peliculas.txt";
    private static final CatalogoPeliculas catalogoPeli = new CatalogoPeliculasImpl();
    private static int opcion = -1;*/
    
    private static final String nombreArchivo = "C:\\Users\\usuario\\Desktop\\LaboratorioFinalSwing\\CatalogoPelicula\\peliculas.txt";

    public static void main(String[] args) {

        /*while (opcion != 0) {
            try {
                System.out.println("Elige opcion:\n1.- Iniciar catalogo peliculas"
                        + "\n2.- Agregar pelicula\n"
                        + "3.- Listar Peliculas\n"
                        + "4.- Buscar Pelicula\n"
                        + "0.- Salir");
                
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        catalogoPeli.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        System.out.println("Introduce el nombre de una pelicula a agregar:");
                        String nombre = scanner.nextLine();
                        catalogoPeli.agregarPelicula(nombre, nombreArchivo);
                        break;
                    case 3:
                        catalogoPeli.listarPeliculas(nombreArchivo);
                        break;
                    case 4:
                        System.out.println("Introduce el nombre de una pelicula a buscar:");
                        String buscar = scanner.nextLine();
                        catalogoPeli.buscarPelicula(nombreArchivo, buscar);
                        break;
                    case 0:
                        System.out.println("!Adios!");
                        break;
                    default:
                        System.out.println("Opcion Incorrecta Ingrese Solo Las Que Le Piden");
                        break;
                }
                System.out.println("\n"); 

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }*/        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
        
        
    }
    
}
