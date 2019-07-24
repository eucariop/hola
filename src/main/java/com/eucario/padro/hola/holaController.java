package com.eucario.padro.hola;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holaController {

    @RequestMapping("/")
    public String index() {
        return "<h1>Hola Eucario!</h><h2>Prueba WAR en Minishift</h2>";
    }

}