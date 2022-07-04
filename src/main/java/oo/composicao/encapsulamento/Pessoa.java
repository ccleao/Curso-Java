package oo.composicao.encapsulamento;

public class Pessoa {
    private int idade;
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome, int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);

    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Metedo Getter
    public int getIdade() {
        return idade;
    }
//Metodo Setter
    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120) {
           this.idade = novaIdade;
        }
    }
}