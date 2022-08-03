package br.edu.impacta.authn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Public")
public class PublicController {
    @GetMapping("/Hello")
    public String hello() {
        return "Hello";
    }
}
