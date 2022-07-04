package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.casaA.Ana;

public class Julia {
    void testeAcessos(){
    Ana sogra = new Ana();

//        System.out.println(sogra.formaDeFalar);//protected
//        System.out.println(sogra.facoDentroDeCasa); //default/package
        System.out.println(sogra.todosSabem);
//        System.out.println(esposa.segredo); private
    }
}

