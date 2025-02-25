package com.prueba.tecnica.models;

/**
 * Clase abstracta que representa un animal con nombre, sonido y tipo.
 * Aplica herencia y encapsulación, asegurando que todas las subclases tengan atributos en común.
 */
public abstract class Animal implements Sonoro {
    private final String nombre;
    private final String onomatopeya;
    private final TipoAnimal tipo;

    public Animal(String nombre, String onomatopeya, TipoAnimal tipo) {
        this.nombre = nombre;
        this.onomatopeya = onomatopeya;
        this.tipo = tipo;
    }

    public String getNombre() { return nombre; }
    public TipoAnimal getTipo() { return tipo; }

    @Override
    public String emitirSonido() {
        return nombre + " hace " + onomatopeya;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Tipo: " + tipo + ", Sonido: " + emitirSonido();
    }
}
