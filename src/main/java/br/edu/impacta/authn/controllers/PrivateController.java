package br.edu.impacta.authn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Private")
public class PrivateController {
    @GetMapping("/Hello")
    public String hello() {
        return "Hello";
    }
}
