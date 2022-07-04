package oo.composicao.Desafio;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto() {
    }
}
