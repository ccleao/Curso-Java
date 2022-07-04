package Lambdas;

public class CalculoTeste1 {
    private static Object gsCalculo;

    public static void main(String[] args) {
        Calculo calculo = (Calculo) new Somar();
        System.out.println(calculo.executar(5, 3));

        Calculo multiplicar = (Calculo) new Multiplicar();
        System.out.println(calculo.executar(5.0, 3.0));

    }
}
