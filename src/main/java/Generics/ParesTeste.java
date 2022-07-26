package Generics;

public class ParesTeste {
    public static void main(String[] args) {

        Pares<Integer, String> resultadoConcurso = new Pares<>();
        resultadoConcurso.adiocionar(1, "Maria");
        resultadoConcurso.adiocionar(2, "Gui");
        resultadoConcurso.adiocionar(3, "Ana");
        resultadoConcurso.adiocionar(4, "Rebeca");
        resultadoConcurso.adiocionar(2, "Pedro");

        System.out.println(resultadoConcurso.getValue(1));
        System.out.println(resultadoConcurso.getValue(2));
        System.out.println(resultadoConcurso.getValue(3));
        System.out.println(resultadoConcurso.getValue(4));
    }
}
