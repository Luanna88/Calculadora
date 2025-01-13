public class Calculadora {
    public double somar(double valor1, double valor2) {
        return valor1 + valor2;
    }
    public double subtrair(double valor1, double valor2) {
        return valor1 - valor2;
    }
    public double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }
    public double dividir(double valor1, double valor2) {
        return valor1 / valor2;
    }
    public double raizQuadrada(double valor) {
        return Math.sqrt(valor);
    }
    public double exponenciar(double base, double expoente) {
        return Math.pow(base, expoente);
    }
    public double bhaskara(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            return Double.NaN;
        }
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        return x1 + x2;
    }
}
