package com.prueba.tecnica.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.List;
import com.prueba.tecnica.models.*;

/**
 * Pruebas unitarias para la clase AnimalParser.
 */
public class AnimalParserTest {

    /**
     * Verifica que los datos de entrada se convierten correctamente en objetos Animal.
     */
    @Test
    public void testParsearEntradaCorrecta() {
        String[] args = {"Rex|terrestre|guau", "Nemo|acuatico|blub", "Drácula|volador|screech"};
        List<Animal> animales = AnimalParser.parsearEntrada(args);

        // Validaciones
        assertEquals(3, animales.size());
        assertTrue(animales.get(0) instanceof Terrestre);
        assertTrue(animales.get(1) instanceof Acuatico);
        assertTrue(animales.get(2) instanceof Volador);
    }

    /**
     * Verifica que los datos con tipos inválidos sean ignorados.
     */
    @Test
    public void testParsearEntradaConTipoInvalido() {
        String[] args = {"Rex|terrestre|guau", "Desconocido|fantasma|buuu"};
        List<Animal> animales = AnimalParser.parsearEntrada(args);

        // Solo "Rex" debe ser válido
        assertEquals(1, animales.size());
        assertTrue(animales.get(0) instanceof Terrestre);
    }

    /**
     * Verifica que las entradas incompletas sean ignoradas.
     */
    @Test
    public void testParsearEntradaIncompleta() {
        String[] args = {"Rex|terrestre", "Nemo|acuatico|blub"};
        List<Animal> animales = AnimalParser.parsearEntrada(args);

        // Solo "Nemo" es válido
        assertEquals(1, animales.size());
        assertTrue(animales.get(0) instanceof Acuatico);
    }
}
