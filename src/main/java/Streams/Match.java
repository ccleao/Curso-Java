package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1, 70);
        Aluno a2 = new Aluno("Gabi", 7.1, 70);
        Aluno a3 = new Aluno("Gui", 2.1, 70);
        Aluno a4 = new Aluno("Luna", 10, 70);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aproved = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aproved.negate();

        System.out.println(alunos.stream().allMatch(aproved));
        System.out.println(alunos.stream().anyMatch(aproved));
        System.out.println(alunos.stream().noneMatch(reprovado));
    }
}
