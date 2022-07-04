package oo.composicao.Desafio;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Sistema {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.AddItem("Caneta", 9.67, 100);
        c1.AddItem(new Produto("Notebook", 1897.99, 2), 2);

        Compra c2 = new Compra();
        c2.AddItem("Caderno", 10, 10);
        c2.AddItem(new Produto("Impressora", 998.90, 1), 1);

       Cliente cliente = new Cliente("João");
       cliente.compras.add(c1);
       cliente.compras.add(c2);

        System.out.println(cliente.getCompras());
        System.out.println(cliente.valorTotal());

    }
}
