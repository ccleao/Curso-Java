package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinaryOperator<Integer> sum = Integer::sum;

        Integer total1 = nums.stream()
                .reduce(sum).get();
        System.out.println(total1);

        Integer total2 = nums.stream().reduce(100, sum);
        System.out.println(total2);

        Integer total3 = nums.parallelStream().reduce(100, sum);
        System.out.println(total3);

        // Resultado foi um Opcional<Integer>...
        nums.stream()
                .filter(n -> n > 5)
                .reduce(sum)
                .ifPresent(System.out::println);

    }
}
