package oo.composicao.Heranca.Desafio;

import oo.composicao.Heranca.Desafio.Carro;
import oo.composicao.Heranca.Desafio.Civic;
import oo.composicao.Heranca.Desafio.Fusca;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Civic();

        c1.acelerar();
        System.out.println("Civic" + c1);
        c1.acelerar();
        System.out.println("Civic" + c1);
        c1.acelerar();
        System.out.println("Civic" + c1);
        c1.frear();
        System.out.println("Civic" + c1);

        Fusca c2 = new Fusca(400);
        c2.ligarTurbo();


        c2.acelerar();
        System.out.println("Fusca" + c2);
        c2.acelerar();
        System.out.println("Fusca" + c2);
        c2.acelerar();
        System.out.println("Fusca" + c2);
        c2.acelerar();
        System.out.println("Fusca" + c2);
        ((Fusca) c2).desligarTurbo();

        c2.frear();
        System.out.println("Fusca" + c2);
        c2.frear();
        System.out.println("Fusca" + c2);
        c2.frear();
        System.out.println("Fusca" + c2);

    }
}
