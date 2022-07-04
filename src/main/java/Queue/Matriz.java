package Queue;

import java.util.Arrays;
import java.util.Scanner;

class DesafioMatriz {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos Alunos ? ");
        int qtdeAlunos = entrada.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int qtdeNotas = entrada.nextInt();

        double[][] notasTurma = new double[qtdeAlunos][qtdeNotas];

        double total = 0;
        for(int a = 0; a < qtdeAlunos; a++) {
            for (int n = 0; n < qtdeNotas; n++){

                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasTurma[a][n] = entrada.nextDouble();
                total += notasTurma[a][n];
            }
        }
        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Média da turma é " + media);

        for (double [] notasDoAluno: notasTurma){
            System.out.println(Arrays.toString(notasDoAluno));
        }
        entrada.close();
    }
}