import org.junit.Assert;
import org.junit.Test;

public class TestCalculadora {

    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros() {
        // Arrange
        double valor1 = 7;
        double valor2 = 9;
        double resultadoEsperado = 16;
        Calculadora calculadora = new Calculadora();
        // Act
        double valorCalculado = calculadora.somar(valor1, valor2);
        // Assert
        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }
    @Test
    public void deveSubtrairCorretamenteQuandoOsValoresForemInteiros() {
        // Arrange
        double valor1 = 10;
        double valor2 = 4;
        double resultadoEsperado = 6;
        Calculadora calculadora = new Calculadora();
        // Act
        double valorCalculado = calculadora.subtrair(valor1, valor2);
        // Assert
        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }
    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros() {
        // Arrange
        double valor1 = 3;
        double valor2 = 5;
        double resultadoEsperado = 15;
        Calculadora calculadora = new Calculadora();
        // Act
        double valorCalculado = calculadora.multiplicar(valor1, valor2);
        // Assert
        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }
    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros() {
        // Arrange
        double valor1 = 10;
        double valor2 = 2;
        double resultadoEsperado = 5;
        Calculadora calculadora = new Calculadora();
        // Act
        double valorCalculado = calculadora.dividir(valor1, valor2);
        // Assert
        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }
    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes() {
        // Arrange
        double valor1 = 5.5;
        double valor2 = 2.2;
        double resultadoEsperado = 2.5;
        Calculadora calculadora = new Calculadora();
        // Act
        double valorCalculado = calculadora.dividir(valor1, valor2);
        // Assert
        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }
    @Test
    public void deveCalcularRaizQuadradaCorretamente() {
        // Arrange
        double valor = 9;
        double resultadoEsperado = 3;
        Calculadora calculadora = new Calculadora();
        // Act
        double resultadoCalculado = calculadora.raizQuadrada(valor);
        // Assert
        Assert.assertEquals(resultadoEsperado, resultadoCalculado, 0.01);
    }
    @Test
    public void deveCalcularExponenciacaoCorretamente() {
        // Arrange
        double base = 2;
        double expoente = 3;
        double resultadoEsperado = 8;
        Calculadora calculadora = new Calculadora();
        // Act
        double resultadoCalculado = calculadora.exponenciar(base, expoente);
        // Assert
        Assert.assertEquals(resultadoEsperado, resultadoCalculado, 0.01);
    }
    @Test
    public void deveCalcularBhaskaraComRaizesReais() {
        // Arrange
        double a = 1;
        double b = -5;
        double c = 6;
        double resultadoEsperado = 5; // Soma das raízes: x' = 3, x'' = 2 -> 3 + 2 = 5
        Calculadora calculadora = new Calculadora();
        // Act
        double resultadoCalculado = calculadora.bhaskara(a, b, c);
        // Assert
        Assert.assertEquals(resultadoEsperado, resultadoCalculado, 0.01);
    }
    @Test
    public void deveRetornarNaNQuandoDeltaForNegativoEmBhaskara() {
        // Arrange
        double a = 1;
        double b = 1;
        double c = 1;
        Calculadora calculadora = new Calculadora();
        // Act
        double resultadoCalculado = calculadora.bhaskara(a, b, c);
        // Assert
        Assert.assertTrue(Double.isNaN(resultadoCalculado));
    }
}
