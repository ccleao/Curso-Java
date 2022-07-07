package Streams;

public class Media {

    private double total;
    private int qntd;

    public Media add(double valor){
        total += valor;
        qntd++;
        return this;
    }

    public double getValor() {
        return total/qntd;
    }
    public static Media combination(Media m1, Media m2){
        Media resultante = new Media();
        resultante.total = m1.total + m2.total;
        resultante.qntd = m1.qntd + m2.qntd;
        return resultante;

    }
}
