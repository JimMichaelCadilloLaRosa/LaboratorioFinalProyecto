
package cl.programacion.avanzada.datos;

import cl.programacion.avanzada.domain.Pelicula;
import cl.programacion.avanzada.excepciones.AccesoDatosEx;
import cl.programacion.avanzada.excepciones.EscrituraDatosEx;
import cl.programacion.avanzada.excepciones.LecturaDatosEx;
import java.io.IOException;
import java.util.List;
import javax.swing.JTextField;


public interface AccesoDatos {

    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

    public void crear(String nombreArchivo) throws AccesoDatosEx;

    public void borrar(String nombreArchivo) throws AccesoDatosEx;

}
