package Prime;
import lombok.ToString;

import java.util.Scanner;

@ToString

public class Teste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number to see if it is prime: ");
        int n = scan.nextInt();
        scan.close();

        int divider = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divider++;
            }
        }
                if (divider == 2)
                    System.out.println("The number is prime !!");
                else {
                    System.out.println("The number is not prime !!");
                }
    }

}
