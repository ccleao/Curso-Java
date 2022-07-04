package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        //Offer e Add -> Adicionam elementos na fila
        //A diferença é o comportamento quando a fila está cheia !

        fila.add("Ana"); //retorna false
        fila.offer("Bia"); //Lança uma exceção
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        //Diferença de comportamento ocorre quando lista está vazia.
        //Peek e Element = Obter proximo elemento da fila sem remover
        System.out.println(fila.peek()); //retorna false
        System.out.println(fila.element()); //lança uma exceção

        //fila.size();
        //fila.clear();
        //fila.IsEmpty();
        //fila.contains(...)

        System.out.println(fila.poll()); //retorna null
        System.out.println(fila.remove());//lança uma exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());


    }
}
