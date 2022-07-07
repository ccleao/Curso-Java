package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> brands = Arrays.asList("BMW ","Honda ", "Audi ");

        brands.stream().map(m -> m.toUpperCase(Locale.ROOT)).forEach(print);

        //UnaryOperator<String> upperCase = n -> n.toUpperCase(Locale.ROOT);
        UnaryOperator<String> firstLetter = n -> n.charAt(0) + "";
        //UnaryOperator<String> scream = n -> n + "!!!";

        System.out.println("Usando composição");
        brands.stream()
                .map(Utilitarios.upperCase)
                .map(firstLetter)
                .map(Utilitarios.scream)
                .forEach(print);
    }
}
