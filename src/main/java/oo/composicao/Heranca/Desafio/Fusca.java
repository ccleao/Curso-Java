package oo.composicao.Heranca.Desafio;

public class Fusca extends Carro implements Esportivo {

    public Fusca(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 15;
    }

    @Override
    public void ligarTurbo() {
        delta = 35;
    }

    @Override
    public void desligarTurbo() {
        delta = 15;
    }
//    @Override
//    public void acelerar() {
//        xSpeed += delta;
//        }


    }


