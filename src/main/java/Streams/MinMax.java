package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1, 70);
        Aluno a2 = new Aluno("Gabi", 6.1, 70);
        Aluno a3 = new Aluno("Gui", 8.1, 70);
        Aluno a4 = new Aluno("Luna", 10, 70);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> bestNote =
                (b1, b2) -> {
            if (b1.nota > b2.nota) return 1;
            if (b1.nota < b2.nota) return -1;
            return 0;
                };
        System.out.println("Melhor nota: " + alunos.stream().max(bestNote).get());
        System.out.println("Pior nota: " + alunos.stream().min(bestNote).get());
    }
}
