package oo.composicao;

public class Motor {

    boolean ligado = false;
    double fatorDeInjecao = 1;

    double giros() {
        if (!ligado) {
            return 0;
        } else {
            return Math.round(fatorDeInjecao * 3000);
        }
    }
}
