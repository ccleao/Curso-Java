package Streams;

public class MediaTeste {

    public static void main(String[] args) {

        Media m1 = new Media().add(8.3).add(6.7);
        Media m2 = new Media().add(7.9).add(6.6);

        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(Media.combination(m1, m2).getValor());

    }
}
