package Streams;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class Aluno {

    public String name;
    public double nota;
    int presenca;


    public Aluno(String name, double nota, int presenca) {
        this.name = name;
        this.nota = nota;
        this.presenca = presenca;
    }
}
