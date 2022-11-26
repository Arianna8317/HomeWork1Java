package HomeWork1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in, "cp866");
        System.out.print("Введите натуральное число N = ");
        int n = myScanner.nextInt();
        System.out.printf("Треугольноe число %d ", triangle(n));
        System.out.printf("    N ! =  %d ", factorial(n));
        myScanner.close();
    }

    private static int triangle(int n) {
        return n * (n - 1) / 2;
    }

    private static int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
