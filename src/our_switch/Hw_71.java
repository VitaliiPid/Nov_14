package our_switch;

import java.util.Scanner;

public class Hw_71 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = performOperation(num1, num2, operator);

        System.out.println("Результат: " + result);
        scanner.close();
    }

     private static double performOperation(double num1, double num2, char operator) {
        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':

                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: Деление на ноль!");
                }
                break;

            default:
                System.out.println("Ошибка: Неверный оператор!");
                break;
        }

        return result;
    }
}