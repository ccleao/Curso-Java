package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambda2 {

    public static void main(String[] args) {


        Function<Produto, Double> finalPrice =
                produto -> produto.preco*(1- produto.desconto);
        UnaryOperator<Double> taxes =
                v -> v >= 2500 ? v * 1.085 : v;
        UnaryOperator<Double> shipment =
                v -> v >= 3000 ? v +100 : v + 50;
        Function<Double, String> arredondar =
                v -> String.format("%.2f", v);
        Function<String, String> format =
                v -> ("R$" + v).replace(".", ",");

        Produto p = new Produto("Ipad", 3235.89, 0.13);

        String price = finalPrice
                .andThen(taxes)
                .andThen(shipment)
                .andThen(arredondar)
                .andThen(format)
                .apply(p);
        System.out.println("The final price is: " + price);
    }
}
