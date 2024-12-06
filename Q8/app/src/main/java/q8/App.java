/*
 * This source file was generated by the Gradle 'init' task
 */
package q8;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println("8.1) Sequence while");
        int n1 = 10;
        int sum1 = 0;
        while (n1 >= 1) {
            System.out.print(n1 + " ");
            sum1 += n1;
            n1--;
        }
        System.out.println("\nSum = " + sum1);

        // 8.2) Sequence: 1 3 5 7 9 11 13 15 17 19
        System.out.println("8.2) Sequence while");
        int n2 = 1;
        int sum2 = 0;
        while (n2 <= 19) {
            System.out.print(n2 + " ");
            sum2 += n2;
            n2 += 2;
        }
        System.out.println("\nSum = " + sum2);

        // 8.3) Sequence: 1, -3, 5, -7, 9, -11, 13, -15, 17, -19
        System.out.println("8.3) Sequence while");
        int n3 = 1;
        int sum3 = 0;
        while (n3 <= 19) {
            System.out.print(n3 + " ");
            sum3 += n3;
            n3 = -n3 + (n3 > 0 ? -2 : 2);
        }
        System.out.println("\nSum = " + sum3);

        // 8.1) Sequence: 10 9 8 7 6 5 4 3 2 1 (hint: counting down)
        System.out.println("8.1) Sequence for");
        int total11 = 0;
        for (int num11 = 10; num11 >= 1; num11--) {
            System.out.print(num11 + " ");
            total11 += num11;
        }
        System.out.println("\nSum = " + total11);

        // 8.2) Sequence: 1 3 5 7 9 11 13 15 17 19
        System.out.println("8.2) Sequence for");
        int total22 = 0;
        for (int num22 = 1; num22 <= 19; num22 += 2) {
            System.out.print(num22 + " ");
            total22 += num22;
        }
        System.out.println("\nSum = " + total22);

        // 8.3) Sequence: 1, -3, 5, -7, 9, -11, 13, -15, 17, -19
        System.out.println("8.3) Sequence for");
        int total33 = 0;
        int sign = 1; // Start with positive number
        for (int num33 = 1; num33 <= 19; num33 += 2) {
            System.out.print(num33 * sign + " ");
            total33 += num33 * sign;
            sign *= -1; // Alternate between positive and negative
        }
        System.out.println("\nSum = " + total33);
    }
}
