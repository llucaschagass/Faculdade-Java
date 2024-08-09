package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConversorDeUnidadesTest {
    ConversorDeUnidades conversor = new ConversorDeUnidades();

    @Test
    public void testMetrosParaQuilometros() {
        assertEquals(1.5, conversor.metrosParaQuilometros(1500), 0.0001);
        assertEquals(0.0, conversor.metrosParaQuilometros(0), 0.0001);
    }

    @Test
    public void testQuilometrosParaMetros() {
        assertEquals(1500, conversor.quilometrosParaMetros(1.5), 0.0001);
        assertEquals(0, conversor.quilometrosParaMetros(0), 0.0001);
    }

    @Test
    public void testCelsiusParaFahrenheit() {
        assertEquals(77.0, conversor.celsiusParaFahrenheit(25), 0.0001);
        assertEquals(32.0, conversor.celsiusParaFahrenheit(0), 0.0001);
    }

    @Test
    public void testFahrenheitParaCelsius() {
        assertEquals(25.0, conversor.fahrenheitParaCelsius(77), 0.0001);
        assertEquals(0.0, conversor.fahrenheitParaCelsius(32), 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMetrosParaQuilometros_ValorNegativo() {
        conversor.metrosParaQuilometros(-100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuilometrosParaMetros_ValorNegativo() {
        conversor.quilometrosParaMetros(-1);
    }
}
