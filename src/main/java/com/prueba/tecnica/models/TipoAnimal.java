package com.prueba.tecnica.models;

import java.util.Arrays;
import java.util.Optional;

/**
 * Enumeración que representa los tipos de animales.
 */
public enum TipoAnimal {
    TERRESTRE, VOLADOR, ACUATICO;

    /**
     * Método que convierte una cadena en un TipoAnimal si coincide con algún valor del enum.
     */
    public static Optional<TipoAnimal> fromString(String tipo) {
        return Arrays.stream(values())
                .filter(t -> t.name().equalsIgnoreCase(tipo))
                .findFirst();
    }
}
