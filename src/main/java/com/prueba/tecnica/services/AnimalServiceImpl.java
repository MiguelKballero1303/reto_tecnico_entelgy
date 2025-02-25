package com.prueba.tecnica.services;

import com.prueba.tecnica.models.Animal;
import com.prueba.tecnica.models.TipoAnimal;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Implementación del servicio de animales.
 */
@Service
public class AnimalServiceImpl implements AnimalService {
    
    /**
     * Agrupa los animales por su tipo usando Streams.
     */
    @Override
    public Map<TipoAnimal, List<Animal>> agruparPorTipo(List<Animal> animales) {
        return animales.stream().collect(Collectors.groupingBy(Animal::getTipo));
    }

    /**
     * Formatea la información de los animales agrupados en un string para su impresión.
     */
    public String imprimirAnimales(Map<TipoAnimal, List<Animal>> animalesAgrupados) {
        return animalesAgrupados.entrySet().stream()
                .map(entry -> "\nAnimales " + entry.getKey() + ":\n" +
                        entry.getValue().stream()
                                .map(Animal::emitirSonido)
                                .collect(Collectors.joining("\n")))
                .collect(Collectors.joining("\n"));
    }
}
