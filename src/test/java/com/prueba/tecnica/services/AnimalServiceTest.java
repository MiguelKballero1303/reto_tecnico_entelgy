package com.prueba.tecnica.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import com.prueba.tecnica.models.*;

/**
 * Pruebas unitarias para la clase AnimalService.
 */
public class AnimalServiceTest {
    // Instancia del servicio a probar
    private final AnimalService service = new AnimalServiceImpl();

    /**
     * Verifica que los animales se agrupan correctamente por tipo.
     */
    @Test
    public void testAgruparPorTipo() {
        // Lista de animales de prueba
        List<Animal> animales = List.of(
                new Terrestre("Rex", "guau"),
                new Acuatico("Nemo", "blub"),
                new Volador("Drácula", "screech")
        );

        // Agrupar los animales por tipo
        Map<TipoAnimal, List<Animal>> agrupados = service.agruparPorTipo(animales);

        // Verificaciones
        assertEquals(1, agrupados.get(TipoAnimal.TERRESTRE).size());
        assertEquals(1, agrupados.get(TipoAnimal.ACUATICO).size());
        assertEquals(1, agrupados.get(TipoAnimal.VOLADOR).size());
    }
}
