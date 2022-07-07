package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
    public static void main(String[] args) {

        Product p1 = new Product("Lapis", 1.99, 0.12, 30);
        Product p2 = new Product("Notebook", 4899.89, 0.32, 0);
        Product p3 = new Product("Caderno", 30, 0.45, 0);
        Product p4 = new Product("Impressora", 1200.00, 0.40, 0);
        Product p5 = new Product("Ipad", 1.99, 0.12, 30);
        Product p6 = new Product("Relogio", 1900.00, 0.12, 0);
        Product p7 = new Product("Monitor", 800.00, 0.31, 0);

        List<Product> products =
        Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Product> hugeDisc = p -> p.discount >= 0.3;
        Predicate<Product> freeShip = p -> p.shipment == 0;
        Predicate<Product> hugePrice = p -> p.price >= 500;

        Function<Product, String> promocao =
                p -> "Aproveite ! " + p.name + " por R$" + p.price;

        products.stream()
                .filter(hugeDisc)
                .filter(freeShip)
                .filter(hugePrice)
                .map(promocao)
                .forEach(System.out::println);

    }
}
