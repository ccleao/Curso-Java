package oo.composicao.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao","Amoedo", 45);

        p1.setIdade(p1.getIdade()); //alterar variarvel
        p1.setNome(p1.getNome());
        System.out.println("Olá eu sou o " + p1.getNome() + " " + p1.getSobrenome() + " e tenho " + p1.getIdade() + " anos de idade");
    }
}
