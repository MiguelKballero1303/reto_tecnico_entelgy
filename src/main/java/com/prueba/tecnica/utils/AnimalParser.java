package com.prueba.tecnica.utils;

import com.prueba.tecnica.models.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de utilidad para parsear los datos de entrada y convertirlos en objetos Animal.
 */
public class AnimalParser {

    /**
     * Convierte un array de strings en una lista de objetos Animal.
     * El formato esperado es "nombre|tipo|onomatopeya".
     */
    public static List<Animal> parsearEntrada(String[] args) {
        List<Animal> animales = new ArrayList<>();

        for (String arg : args) {
            String[] datos = arg.split("\\|");
            if (datos.length == 3) {
                String nombre = datos[0];
                String tipoStr = datos[1];
                String onomatopeya = datos[2];

                // Convierte el tipo de animal desde la cadena y crea la instancia correspondiente.
                TipoAnimal.fromString(tipoStr).ifPresent(tipo -> {
                    switch (tipo) {
                        case TERRESTRE -> animales.add(new Terrestre(nombre, onomatopeya));
                        case VOLADOR -> animales.add(new Volador(nombre, onomatopeya));
                        case ACUATICO -> animales.add(new Acuatico(nombre, onomatopeya));
                    }
                });
            }
        }
        return animales;
    }
}
