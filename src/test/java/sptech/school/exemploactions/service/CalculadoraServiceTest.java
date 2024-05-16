package sptech.school.exemploactions.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.*;


    class CalculadoraServiceTest {

        @Test
        @DisplayName("Quando acionado com 10 e 2, então deve retornar 5")
        public void testDividir(){

            // Arrange
            CalculadoraService calculadoraService = new CalculadoraService();
            double a = 10;
            double b = 2;
            double esperado = 5;

            // Act
            double resultado = calculadoraService.dividir(a,b);

            // Assert
            assertEquals(esperado, resultado);
        }


        @Test
        @DisplayName("Quando acionado com 10 e 0, então deve lançar uma exceção")
        public void testDividirPorZero(){

            // Arrange
            CalculadoraService calculadoraService = new CalculadoraService();
            double a = 10;
            double b = 0;
            var expectedMessage = "400 BAD_REQUEST \"Divisão por zero não permitida\"";

            // Assert
            ResponseStatusException exception = assertThrows(ResponseStatusException.class, () -> {calculadoraService.dividir(a,b);});

            // Assert
            assertEquals(expectedMessage, exception.getMessage());

        }
    }