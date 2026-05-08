package cl.usm.calculadoraspring.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {

    @Test
    void calcular_SumaOk() {
        CalculadoraService calculadoraService = new CalculadoraService();
        double resultado = calculadoraService.calcular("+", 1, 2);
        assertEquals(3, resultado);
    }

    @Test
    void calcular_RestaOk() {
        CalculadoraService calculadoraService = new CalculadoraService();
        double resultado = calculadoraService.calcular("-", 2, 1);
        assertEquals(1, resultado);
    }

    @Test
    void calcular_MultiplicacionOk() {
        CalculadoraService calculadoraService = new CalculadoraService();
        double resultado = calculadoraService.calcular("*", 2, 1);
        assertEquals(2, resultado);
    }
    @Test
    void calcular_SumaFailed() {
        CalculadoraService calculadoraService = new CalculadoraService();
        double resultado = calculadoraService.calcular("-", 1, 2);
        assertNotEquals(3, resultado);
    }
    @Test
    void calcular_DivisionOk() {
        CalculadoraService calculadoraService = new CalculadoraService();
        double resultado = calculadoraService.calcular("/", 4, 2);
        assertEquals(2, resultado);
    }
    @Test
    void calcular_DivisionNoOk() {
        CalculadoraService calculadoraService = new CalculadoraService();
        Exception ex = assertThrows(NumberFormatException.class, ()->{
           double resultado = calculadoraService.calcular("/",5,0);
        });
        assertEquals("can't divide by zero", ex.getMessage());
    }
    @Test
    void calcular_OperacionNoOk() {
        CalculadoraService calculadoraService = new CalculadoraService();
        Exception ex = assertThrows(NumberFormatException.class, ()->{
            double resultado = calculadoraService.calcular("$",5,0);
        });
        assertEquals("Invalid operation", ex.getMessage());
    }
}