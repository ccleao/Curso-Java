package Queue;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
@EqualsAndHashCode

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> l1 = new ArrayList<>();

        l1.add(new Usuario("Ana"));
        l1.add(new Usuario("Lia"));
        l1.add(new Usuario("Bia"));
        l1.add(new Usuario("Manu"));

        System.out.println(l1.get(3)); //acessar pelo indice
        l1.remove(1);
        System.out.println(l1.remove(new Usuario("Manu")));
        System.out.println(l1.contains(new Usuario("Ana")));

        for(Usuario u: l1){
            System.out.println(u);

        }

    }
}
