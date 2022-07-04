package Queue;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuario = new HashMap<>();
        usuario.put(1, "Roberto");
        usuario.put(2, "Ricardo");
        usuario.put(3, "Rafaela");
        usuario.put(4, "Rebeca");

        System.out.println(usuario.size());
        System.out.println(usuario.isEmpty());
        System.out.println(usuario.keySet());
        System.out.println(usuario.values());
        System.out.println(usuario.entrySet());

        System.out.println(usuario.containsKey(20));
        System.out.println(usuario.containsValue("Rebeca"));

        System.out.println(usuario.get(4));

        //percorrer elementos

        for(int chave: usuario.keySet()){
            System.out.println(chave);
        }
        for(String valor: usuario.values()){
            System.out.println(valor);
        }
        for (Map.Entry<Integer, String> registro: usuario.entrySet()){
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }
    }
}
