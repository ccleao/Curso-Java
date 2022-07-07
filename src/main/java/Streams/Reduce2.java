package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1, 70);
        Aluno a2 = new Aluno("Gabi", 6.1, 70);
        Aluno a3 = new Aluno("Gui", 8.1, 70);
        Aluno a4 = new Aluno("Luna", 10, 70);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aproved = a -> a.nota >= 7;
        Function<Aluno, Double> apenasNota = a -> a.nota;
        BinaryOperator<Double> sum = Double::sum;

        alunos.stream()
                .filter(aproved)
                .map(apenasNota)
                .reduce(sum)
                .ifPresent(System.out::println);
    }
}
