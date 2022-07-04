package oo.composicao.Heranca.Desafio;
import lombok.ToString;

@ToString
public class Carro {
    final int VELOCIDADE_MAXIMA;
    int xSpeed;
    int delta;

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
    public void frear(){
        if (xSpeed >= delta) {
            xSpeed -= delta;
        } else {
            xSpeed = 0;
        }
    }
    public void acelerar() {
        if (xSpeed + delta > VELOCIDADE_MAXIMA) {
            xSpeed = VELOCIDADE_MAXIMA;
        } else {
            xSpeed += delta;
        }
    }
}
