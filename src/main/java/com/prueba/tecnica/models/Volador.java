package com.prueba.tecnica.models;

/**
 * Implementación de un animal volador.
 */
public class Volador extends Animal {
    public Volador(String nombre, String onomatopeya) {
        super(nombre, onomatopeya, TipoAnimal.VOLADOR);
    }
}
