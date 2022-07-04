package oo.composicao.Desafio;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
public class Compra {

    final List<Item> itens = new ArrayList<>();

    public void AddItem(Produto nome, int qtde){
        this.itens.add(new Item(nome,qtde));
    }

   public void AddItem(String nome, double preco, int qtde) {

    }

    public double valorTotal(){
        double total = 0;

        for (Item item: itens){
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
