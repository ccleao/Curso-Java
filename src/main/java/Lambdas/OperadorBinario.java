package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {

        BinaryOperator<Double> media =
                (n1, n2) -> (n1 + n2) /2;
        System.out.println(media.apply(9.8, 5.7));

        BiFunction<Double, Double, String> result =
                (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(result.apply(9.5, 1.6));

        Function<Double, String> concept =
                m -> m>=7 ? "Aprovado" : "Reprovado";
        System.out.println(media.andThen(concept).apply(9.7, 5.1));
    }
}
