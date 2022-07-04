package Lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Produto> isExpensive =
                prod -> (prod.preco * (1- prod.desconto)) >= 750;

        Produto produto = new Produto("Notebook", 3893.89,0.15);
        System.out.println(isExpensive.test(produto));

        Produto p1 = new Produto("Caneta", 1.15, 0.15);
        System.out.println(isExpensive.test(p1));
    }
}
