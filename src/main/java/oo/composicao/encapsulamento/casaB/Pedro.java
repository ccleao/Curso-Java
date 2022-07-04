package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {
        System.out.println(formaDeFalar);
//        System.out.println(facoDentroDeCasa); default/package
        System.out.println(todosSabem);
//       System.out.println(mae.segredo); private
    }
}