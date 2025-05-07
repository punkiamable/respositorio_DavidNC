package modelo;

/**
 * Clase que representa un perro, heredando de la clase Animal.
 * Implementa el comportamiento específico de un perro, incluyendo
 * el sonido característico (ladrido) mediante la implementación
 * del método abstracto de la clase padre.
 * 
 * @author David
 * @version 1.0
 */
public class Perro extends Animal {

    /**
     * Constructor que crea un perro con un nombre específico.
     * 
     * @param nombre El nombre que se asignará al perro
     */
    public Perro(String nombre) {
        super(nombre);
    }

    /**
     * Implementación del método abstracto que hace que el perro ladre.
     * Muestra "WOOF" en la salida estándar cuando el perro hace sonido.
     */
    @Override
    public void sonido() {
        System.out.println("WOOF");
    }

    /**
     * Devuelve una representación en cadena del perro.
     * Reutiliza la implementación de la clase padre Animal.
     * 
     * @return Una cadena que representa al perro, incluyendo su nombre
     */
    @Override
    public String toString() {
        return super.toString();
    }
}