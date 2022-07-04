package oo.composicao.Polimorfismo.Desafio;

import oo.composicao.Polimorfismo.Arroz;
import oo.composicao.Polimorfismo.Feijao;
import oo.composicao.Polimorfismo.Pessoa;
import oo.composicao.Polimorfismo.Sorvete;

public class Jantar {
    public static void main(String[] args) {
        oo.composicao.Polimorfismo.Pessoa convidado = new Pessoa(99.65);

        oo.composicao.Polimorfismo.Arroz i1 = new Arroz(0.2);
        oo.composicao.Polimorfismo.Feijao i2 = new Feijao(0.1);

        System.out.println(convidado.getPeso());

        convidado.comer(i1);
        convidado.comer(i2);
        System.out.println(convidado.getPeso());

        oo.composicao.Polimorfismo.Sorvete i3 = new Sorvete(0.4);
        convidado.comer(i3);

        System.out.println(convidado.getPeso());
    }
}
