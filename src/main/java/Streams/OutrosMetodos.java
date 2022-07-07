package Streams;


import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1, 70);
        Aluno a2 = new Aluno("Gabi", 6.1, 70);
        Aluno a3 = new Aluno("Gui", 8.1, 70);
        Aluno a4 = new Aluno("Luna", 10, 70);
        Aluno a5 = new Aluno("Ana", 7.1, 70);
        Aluno a6 = new Aluno("Pedro", 6.1, 70);
        Aluno a7 = new Aluno("Gui", 8.1, 70);
        Aluno a8 = new Aluno("Maria", 10, 70);

        List<Aluno> alunos =
                Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        System.out.println("Distinct... ");
        alunos.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("Skip/Limit...");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("takeWhile...");
        alunos.stream()
                .distinct()
                .skip(2)
                .takeWhile(a -> a.nota >= 6)
                .forEach(System.out::println);

    }
}
