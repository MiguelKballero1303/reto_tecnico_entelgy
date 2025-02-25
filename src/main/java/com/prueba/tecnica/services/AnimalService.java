package com.prueba.tecnica.services;

import com.prueba.tecnica.models.Animal;
import com.prueba.tecnica.models.TipoAnimal;

import java.util.List;
import java.util.Map;

/**
 * Interfaz que define los servicios para la gestión de animales.
 */ 
public interface AnimalService {
    /**
     * Agrupa una lista de animales por su tipo.
     */
    Map<TipoAnimal, List<Animal>> agruparPorTipo(List<Animal> animales);
}
