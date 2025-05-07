package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Pruebas unitarias para la clase Gato
 */
class GatoTest {
    
    @Test
    void testSonidoGato() {
        // Redirigir System.out para capturar la salida
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        Gato gato = new Gato("Misi");
        gato.sonido();
        
        // Verificar que el sonido sea "MEOW"
        String salida = outputStream.toString().trim();
        assertEquals("MEOW", salida, "El gato debería maullar 'MEOW'");
        
        // Restaurar System.out
        System.setOut(System.out);
    }
    
    @Test
    void testToStringGato() {
        Gato gato = new Gato("Misi");
        String esperado = "Animal [nombre=Misi]";
        assertEquals(esperado, gato.toString(), "El toString no coincide");
    }
}