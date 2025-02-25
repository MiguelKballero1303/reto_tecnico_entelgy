package com.prueba.tecnica.models;

/**
 * Implementación de un animal acuático.
 */
public class Acuatico extends Animal {
    public Acuatico(String nombre, String onomatopeya) {
        super(nombre, onomatopeya, TipoAnimal.ACUATICO);
    }
}
