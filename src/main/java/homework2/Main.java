package homework2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("Incert the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("1. Factorial calculation");
        long factorial = 1;
        for (int n = 1; n<=number; n++) {
            factorial=factorial*n;
        }
        System.out.println("Factorial = " +factorial);
        System.out.println();

        System.out.println("2. Fibonacci series");
        int f1 = 1;
        int f2 = 1;
        if (number<=2) {
            System.out.println("1");
        }
        else {
            System.out.print(f1 + " " + f2 + " ");
            for (int i = 3; i <= number; i++) {
                System.out.print(f1 + f2 + " ");
                int b = f1;
                f1 = f2;
                f2 = b + f1;
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("3. Tree");
        Tree(number);
    }

    private static void Tree(int n) {
        for (int i = 0; i < n; i++) {
            triangles(i+1,n);
        }
    }
    private static void triangles(int n, int max) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < max - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("x");
            }
            System.out.println("");
        }
    }
}


