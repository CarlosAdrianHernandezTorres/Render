package com.render.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/saludo")
    public String saludo() {
        return "¡Hola, mundo, esta es una prueba de Spring Boot desde Render!";
    }
}
