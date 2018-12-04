
package cl.programacion.avanzada.domain;

import javax.swing.JTextField;

public class Pelicula {
    
   String nombre;

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
