package com.prueba.tecnica;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.prueba.tecnica.config.AppConfig;
import com.prueba.tecnica.models.Animal;
import com.prueba.tecnica.models.TipoAnimal;
import com.prueba.tecnica.services.AnimalService;
import com.prueba.tecnica.utils.AnimalParser;

/**
 * Clase principal que inicia la aplicación.
 * Utiliza Spring Framework para gestionar los componentes sin Spring Boot.
 */
public class TecnicaApplication {
    public static void main(String[] args) {
        // Configura el contexto de Spring utilizando la clase AppConfig.
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalService animalService = context.getBean(AnimalService.class);

        // Verifica si se han proporcionado argumentos en la ejecución.
        if (args.length == 0) {
            System.out.println("No se proporcionaron datos de entrada.");
            return;
        }

        // Imprime los argumentos recibidos.
        System.out.println("Argumentos recibidos:");
        for (String arg : args) {
            System.out.println(arg);
        }

        // Convierte los argumentos en objetos Animal.
        List<Animal> animales = AnimalParser.parsearEntrada(args);
        System.out.println("\nAnimales parseados:");
        animales.forEach(System.out::println);

        // Agrupa los animales por su tipo.
        Map<TipoAnimal, List<Animal>> animalesAgrupados = animalService.agruparPorTipo(animales);
        
        // Imprime los animales agrupados.
        System.out.println("\nAnimales agrupados por tipo:");
        animalesAgrupados.forEach((tipo, lista) -> {
            System.out.println("\nAnimales " + tipo + ":");
            lista.forEach(System.out::println);
        });
    }
}
