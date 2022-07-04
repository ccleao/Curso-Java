package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Gui");

        System.out.println("Forma Tradicional");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda #01...");
        aprovados.forEach ((nome) -> System.out.println(nome + "!!!!"));

        System.out.println("\nMethod Reference #1");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda #02...");
        aprovados.forEach ((nome) -> myPrint(nome));

        System.out.println("\nMethod Reference #2");
        aprovados.forEach(Foreach::myPrint);
        }
        static void myPrint(String nome) {
            System.out.println("Hi my name is " + nome);
        }
    }

