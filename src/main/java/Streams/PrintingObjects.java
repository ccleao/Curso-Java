package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintingObjects {
    public static void main(String[] args) {

        List<String> approved = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        System.out.println("Using Foreach...");
        for (String name: approved){
            System.out.println(name);
        }

        System.out.println("Using Itarator...");
        Iterator<String> it = approved.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Using Stream...");
        Stream<String> st = approved.stream();
        st.forEach(System.out::println); //Laço interno.
    }
}
