package Lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class DesafioLambda {
    public static void main(String[] args) {
        Produto p = new Produto("Ipad", 3235.89, 0.13);


        double finalPrice = p.preco * (1 - p.desconto);
        System.out.println("O preço original é de: " + finalPrice);

        if (finalPrice >= 2500) {
            double taxPrice = finalPrice * (1.085);
            System.out.println("Produto tem imposto de 8.5%: " + taxPrice);
        } else {
            System.out.println("Produto isento de imposto: " + finalPrice);
        }
        if (finalPrice >= 3000) {
            double taxShipPrice = finalPrice * (1.085);
            double taxShipTotal = taxShipPrice + 100;

            System.out.println("O valor com frete é de: " + taxShipTotal);
        } else {
            double taxShipTotal2 = p.preco + 50;
            System.out.println("O valor sem frete é de: " + taxShipTotal2);
        }

    }
}
