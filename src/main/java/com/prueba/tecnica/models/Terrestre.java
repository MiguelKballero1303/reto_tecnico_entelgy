package com.prueba.tecnica.models;

/**
 * Implementación de un animal terrestre.
 */
public class Terrestre extends Animal {
    public Terrestre(String nombre, String onomatopeya) {
        super(nombre, onomatopeya, TipoAnimal.TERRESTRE);
    }
}
