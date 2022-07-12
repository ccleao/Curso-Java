package Excecao.personalizadaA;

import Streams.Aluno;

import java.util.EmptyStackException;

public class Validate {
    private Validate(){}

    public static void aluno(Aluno aluno){
        if(aluno == null){
            throw new IllegalArgumentException("O aluno está nulo");
        }
        if (aluno.name == null || aluno.name.trim().isEmpty()){
            throw new EmptyStackException();
        }
        if (aluno.nota <0 || aluno.nota >10){
            throw new NegativeNumberExcp("nota");
        }
    }
}
