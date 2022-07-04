package Lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {

        Predicate<Integer> isPar =
                n -> n % 2 == 0;
        Predicate<Integer> isTripleDigit =
                n -> n >= 100 && n <= 999;
        System.out.println(isPar.and(isTripleDigit).negate().test(123));

    }
}
