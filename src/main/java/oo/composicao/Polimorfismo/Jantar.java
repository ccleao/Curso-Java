package oo.composicao.Polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);

        Arroz i1 = new Arroz(0.2);
        Feijao i2 = new Feijao(0.1);

        System.out.println(convidado.getPeso());

        convidado.comer(i1);
        convidado.comer(i2);
        System.out.println(convidado.getPeso());

        Sorvete i3 = new Sorvete(0.4);
        convidado.comer(i3);

        System.out.println(convidado.getPeso());
    }
}
