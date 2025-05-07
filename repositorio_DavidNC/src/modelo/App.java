package modelo;

/**
 * Clase principal que demuestra el uso de las clases Animal, Perro y Gato.
 * Crea instancias de un perro y un gato, muestra sus nombres y reproduce sus sonidos característicos.
 * 
 * @author David
 * @version 1.0
 */
public class App {

    /**
     * Método principal que ejecuta la demostración de funcionalidad.
     */
    public static void main(String[] args) {
        // Creación de instancias
        Perro p = new Perro("Juan Cuesta");
        Gato g = new Gato("Maite Figeroa");
        
        // Mostrar información y sonidos de los animales
        System.out.println(p.getNombre());
        p.sonido();
        System.out.println(g.getNombre());
        g.sonido();
    }
}