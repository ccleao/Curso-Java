package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {

        BinaryOperator<Double> calculo = (x, y) -> {return x + y;};
        System.out.println(calculo.apply(5.0, 3.0));

        calculo = (x, y) -> x * y;
        System.out.println(calculo.apply(5.0, 3.0));

        BinaryOperator<Integer> calculo2 = (x, y) -> {return x + y;};
        System.out.println(calculo2.apply(5, 3));

        calculo2 = (x, y) -> x * y;
        System.out.println(calculo2.apply(5, 3));
    }
}