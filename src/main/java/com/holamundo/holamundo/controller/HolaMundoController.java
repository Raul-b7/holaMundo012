package com.holamundo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {
         @GetMapping("/Chao")
    public String chaoMundo()
    {
        return "¡CHAO MUNDO!";
    }
    
             @GetMapping("/hola")
    public String holaMundo()
    {
        return "Hola MUNDO!";
   }
//Cambios para Git
}


