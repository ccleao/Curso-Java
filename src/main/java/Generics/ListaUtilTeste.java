package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {


    List<String> langs = Arrays.asList("JS", "PHP", "JAVA", "C++");
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String lastLanguage = (String) ListaUtil.getLast1(langs);
        System.out.println(lastLanguage);

        Integer lastNumber = (Integer) ListaUtil.getLast1(nums);
        System.out.println(lastNumber);

        //Generics;

        String lastLanguage2 = ListaUtil.getLast2(langs);
        System.out.println(lastLanguage2);

        Integer lastNumber2 = ListaUtil.getLast2(nums);
        System.out.println(lastNumber2);
    }
}