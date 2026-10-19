package Lab1;

import java.util.Scanner;

public class task2 {

    static int square(int a) {
        return a * a;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n > 0)
            System.out.println("Positive");
        else if (n < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println(square(n));

    }
}
