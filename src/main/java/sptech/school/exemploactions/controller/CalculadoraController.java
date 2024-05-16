package sptech.school.exemploactions.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.school.exemploactions.service.CalculadoraService;

@RestController
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {

        this.calculadoraService = calculadoraService;

    }

    @PostMapping("/divisao/{a}/{b}")

    public ResponseEntity<Double> divisao(@PathVariable double a, @PathVariable double b) {

        return ResponseEntity.ok(calculadoraService.dividir(a, b));

    }
}
