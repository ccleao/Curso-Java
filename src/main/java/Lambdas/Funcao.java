package Lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer, String> parOuImpar =
                n -> n % 2 == 0 ? "Par" : "Impar";

        Function<String, String > theResultIs =
                valor -> "The result is: " + valor;

        Function<String, String> empolgado =
                valor -> valor + "!!!";

        String FinalResult =
                parOuImpar
                        .andThen(theResultIs)
                        .andThen(empolgado)
                        .apply(32);

        System.out.println(parOuImpar.apply(32));
        System.out.println(FinalResult);

    }
}
