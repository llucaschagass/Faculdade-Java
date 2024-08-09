import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTeste {
    @Test
    public void somandoComSucesso(){
        Calculadora calculadora = new Calculadora();
        int result = calculadora.somar(10, 50);

        assertEquals(60, result);
    }

    @Test
    public void subtraindoComSucesso(){
        Calculadora calculadora = new Calculadora();
        int result = calculadora.subtrair(10, 5);

        assertEquals(5, result);
    }

    @Test
    public void multiplicandoComSucesso(){
        Calculadora calculadora = new Calculadora();
        int result = calculadora.multiplicar(3, 4);

        assertEquals(12, result);
    }

    @Test
    public void dividindoComSucesso(){
        Calculadora calculadora = new Calculadora();
        int result = calculadora.dividir(20, 2);

        assertEquals(10, result);
    }

    @Test
    public void potenciandoComSucesso(){
        Calculadora calculadora = new Calculadora();
        double result = calculadora.potenciar(3, 3);

        assertEquals(27, result, 0);
    }
}
