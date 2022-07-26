package Generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(3.1415);
        System.out.println(caixaA.abrir());

        CaixaNumero<Double> caixaB = new CaixaNumero<>();
        caixaA.guardar(5.15896);
        System.out.println(caixaA.abrir());
    }
}
