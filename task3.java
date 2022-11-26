package HomeWork1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        try {
            System.out.print("Введите первое число : ");
            Scanner scan = new Scanner(System.in, "cp866");
            String stringX = scan.next();
            double x = Double.parseDouble(stringX);

            System.out.print("Введите второе число : ");
            // Scanner scanY = new Scanner(System.in, "cp866");
            String stringY = scan.next();
            double y = Double.parseDouble(stringY);

            System.out.print("Введите операцию : ");
            // Scanner scanOp = new Scanner(System.in, "cp866");
            String r = scan.next();
            char op = r.charAt(0);
            scan.close();
            switch (op) {
                case '+':
                case '-':
                case '*':
                case '/':
                    double result = Calculator(x, y, op);
                    System.out.printf("Результат равен %.02f", result);
                    break;
                default:
                    System.out.println("Операция +, -, * или /");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Неправильный ввод чисел! Допускаются только цифры, - перед числом и .");
        } finally {
            System.out.println("Попробуйте еще раз!");
        }
    }

    private static double Calculator(double x, double y, char op) {
        double result = 0;
        switch (op) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
        }
        return result;
    }

}