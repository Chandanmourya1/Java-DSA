// package LOOP;
import java.util.*;

public class EvenOddSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Enter the numbers:");

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenSum += num;   // add to even sum
            } else {
                oddSum += num;    // add to odd sum
            }
        }

        System.out.println("Sum of Even numbers = " + evenSum);
        System.out.println("Sum of Odd numbers = " + oddSum);

        sc.close();
    }
}