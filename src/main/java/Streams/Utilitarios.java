package Streams;

import java.util.Locale;
import java.util.function.UnaryOperator;

public class Utilitarios {

    private Utilitarios(){

    }

   final static public UnaryOperator<String> upperCase =
           n -> n.toUpperCase(Locale.ROOT);
   final static public UnaryOperator<String> firstLetter =
           n -> n.charAt(0) + "";
   final static public UnaryOperator<String> scream =
           n -> n + "!!!";
}
