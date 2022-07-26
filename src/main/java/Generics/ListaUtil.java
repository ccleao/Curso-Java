package Generics;

import java.util.List;

public class ListaUtil {

    public static Object getLast1(List<?> lista ){
        return lista.get(lista.size()-1);

    }
    public static <T> T getLast2(List<T> lista ){
        return lista.get(lista.size()-1);

    }
}
