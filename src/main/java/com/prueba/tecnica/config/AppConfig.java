package com.prueba.tecnica.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuración de Spring para el escaneo de componentes.
 * Permite la detección automática de beans en el paquete base.
 */
@Configuration
@ComponentScan(basePackages = "com.prueba.tecnica")
public class AppConfig {
}
