package cl.usm.calculadoraspring.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class
CalculadoraServiceTest {

    CalculadoraService calculadoraService;

    @BeforeEach
    void setUp(){
        calculadoraService = new CalculadoraService();
    }

    @Test
    void calcular_SumaOk() {
        double resultado = calculadoraService.calcular("+", 1, 2);
        assertEquals(3, resultado);
    }

    @Test
    void calcular_RestaOk() {
        double resultado = calculadoraService.calcular("-", 2, 1);
        assertEquals(1, resultado);
    }

    @Test
    void calcular_MultiplicacionOk() {
        double resultado = calculadoraService.calcular("*", 2, 1);
        assertEquals(2, resultado);
    }
    @Test
    void calcular_SumaFailed() {
        double resultado = calculadoraService.calcular("-", 1, 2);
        assertNotEquals(3, resultado);
    }
    @Test
    void calcular_DivisionOk() {
        double resultado = calculadoraService.calcular("/", 4, 2);
        assertEquals(2, resultado);
    }
    @Test
    void calcular_DivisionNoOk() {
        Exception ex = assertThrows(NumberFormatException.class, ()->{
           double resultado = calculadoraService.calcular("/",5,0);
        });
        assertEquals("can't divide by zero", ex.getMessage());
    }
    @Test
    void calcular_OperacionNoOk() {
        Exception ex = assertThrows(NumberFormatException.class, ()->{
            double resultado = calculadoraService.calcular("$",5,0);
        });
        assertEquals("Invalid operation", ex.getMessage());
    }
}