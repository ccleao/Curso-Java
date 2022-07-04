package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> print = p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Caneta", 12.34, 0.09);
        print.accept(p1);
        Produto p2 = new Produto("Notebook", 5800, 0.15);
        Produto p3 = new Produto("Caderno", 20.15, 0.1);
        Produto p4 = new Produto("Lápis", 2.99, 0.09);
        Produto p5 = new Produto("Borracha", 1.99, 0.09);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(print);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
