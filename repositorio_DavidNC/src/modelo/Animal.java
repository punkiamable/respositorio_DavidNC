package modelo;

/**
 * Clase abstracta que representa un animal genérico.
 * Proporciona la estructura básica y comportamiento común para todos los animales,
 * incluyendo un nombre y la capacidad de emitir sonidos (método abstracto).
 * Las clases derivadas deben implementar el método sonido() para definir
 * el sonido característico de cada animal concreto.
 * 
 * @author David
 * @version 1.0
 */
public abstract class Animal {

    /** 
     * Nombre del animal. 
     */
    private String nombre;

    /**
     * Constructor que crea un animal con un nombre específico.
     * 
     * @param nombre El nombre que se asignará al animal
     */
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el nombre del animal.
     * 
     * @return El nombre actual del animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el animal.
     * 
     * @param nombre El nuevo nombre a asignar al animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve una representación en cadena del animal.
     * 
     * @return Una cadena que representa al animal, incluyendo su nombre
     */
    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + "]";
    }
    
    /**
     * Método abstracto que debe ser implementado por las hijas
     * para definir el sonido característico del animal.
     */
    public abstract void sonido();
}