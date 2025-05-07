package modelo;

/**
 * Clase que representa un gato, heredando de la clase Animal.
 * Implementa el comportamiento específico de un gato, incluyendo
 * el sonido característico (maullido) mediante la implementación
 * del método abstracto de la clase padre.
 * 
 * @author David
 * @version 1.0
 */
public class Gato extends Animal {

    /**
     * Constructor que crea un gato con un nombre específico.
     * 
     * @param nombre El nombre que se asignará al gato
     */
    public Gato(String nombre) {
        super(nombre);
    }

    /**
     * Implementación del método abstracto que hace que el gato maulle.
     * Muestra "MEOW" en la salida estándar cuando el gato hace sonido.
     */
    @Override
    public void sonido() {
        System.out.println("MEOW");
    }

    /**
     * Devuelve una representación en cadena del gato.
     * Reutiliza la implementación de la clase padre Animal.
     * 
     * @return Una cadena que representa al gato, incluyendo su nombre
     */
    @Override
    public String toString() {
        return super.toString();
    }
}