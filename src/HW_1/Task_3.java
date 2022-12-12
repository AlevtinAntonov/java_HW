/* 3.Реализовать простой калькулятор*/
package HW_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        double a;
        double b;
        char s;
        double res = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа: \n");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        System.out.print("Введите действие ( +, -, *, /) : ");
        s = scanner.next().charAt(0);
        scanner.close();

        switch (s) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '/':
                res = a / b;
                break;
            case '*':
                res = a * b;
                break;
            default:
                System.out.print("\nОшибка! Введите корректный оператор!\n");
                return;
        }
        System.out.printf("\nРезультат : %s %s %s = %s", a, s, b, res);
    }
}
