
package cl.programacion.avanzada.excepciones;

import java.io.FileNotFoundException;

public class AccesoDatosEx extends Exception {

    String mensajeException;

    public AccesoDatosEx(String mensaje) {
        this.mensajeException = mensaje;
    }
}
