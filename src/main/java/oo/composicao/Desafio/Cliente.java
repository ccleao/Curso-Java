package oo.composicao.Desafio;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
public class Cliente<total, compras> {
    List<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
    }
    public double valorTotal() {
        double total = 0;
        for (Compra compra : compras) {
            total += (compra.valorTotal());
        }
        return total;
    }
}