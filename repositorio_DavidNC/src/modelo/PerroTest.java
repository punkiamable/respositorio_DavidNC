package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Pruebas unitarias para la clase Perro
 */
class PerroTest {
    
    @Test
    void testSonidoPerro() {
        // Redirigir System.out para capturar la salida
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        Perro perro = new Perro("Rex");
        perro.sonido();
        
        // Verificar que el sonido sea "WOOF"
        String salida = outputStream.toString().trim();
        assertEquals("WOOF", salida, "El perro debería ladrar 'WOOF'");
        
        // Restaurar System.out
        System.setOut(System.out);
    }
    
    @Test
    void testToStringPerro() {
        Perro perro = new Perro("Rex");
        String esperado = "Animal [nombre=Rex]";
        assertEquals(esperado, perro.toString(), "El toString no coincide");
    }
}