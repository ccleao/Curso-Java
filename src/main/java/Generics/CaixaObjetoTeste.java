package Generics;

import lombok.Data;

@Data
public class CaixaObjetoTeste {
    public static void main(String[] args) {
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3);

        Double coisa = (Double) caixaA.abrir();
        System.out.println(coisa);

        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardar("Hi");

        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);

    }
}
