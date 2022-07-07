package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.8, 70);
        Aluno a2 = new Aluno("Bia", 5.8, 60);
        Aluno a3 = new Aluno("Daniel", 9.8, 80);
        Aluno a4 = new Aluno("Gui", 6.8, 90);
        Aluno a5 = new Aluno("Rebeca", 7.1, 60);
        Aluno a6 = new Aluno("Pedro", 8.8, 50);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);

        Predicate<Aluno> approved = a -> a.nota >= 7;
        Function<Aluno, String> saudacao =
                a -> "Parabens " + a.name + "! Você foi Aprovado(a) !";
        Predicate<Aluno> presenca = a -> a.presenca >=59;

        alunos.stream()
                .filter(approved)
                .filter(presenca)
                .map(saudacao)
                .forEach(System.out::println);



        Predicate<Aluno> failed = a -> a.nota <= 7 || a.presenca <=59;
        Function<Aluno, String> failed2 =
                a -> a.name + "Você foi reprovado !";
        alunos.stream()
                .filter(failed)
                .map(failed2)
                .forEach(System.out::println);
    }
}
