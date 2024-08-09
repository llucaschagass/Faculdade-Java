package org.example;

public class ConversorDeUnidades {
    // Conversor de metros para quilômetros
    public double metrosParaQuilometros(double metros) {
        if (metros < 0) {
            throw new IllegalArgumentException("O valor em metros não pode ser negativo.");
        }
        return metros / 1000;
    }

    // Conversor de quilômetros para metros
    public double quilometrosParaMetros(double quilometros) {
        if (quilometros < 0) {
            throw new IllegalArgumentException("O valor em quilômetros não pode ser negativo.");
        }
        return quilometros * 1000;
    }

    // Conversor de Celsius para Fahrenheit
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Conversor de Fahrenheit para Celsius
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
