/*1. Вычислить n-ое треугольного число(сумма чисел от 1 до n),
n!(произведение чисел от 1 до n)*/
package HW_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        int arrSum = 0;
        int arrMulti = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
                arrSum += i;
                arrMulti *= i;
            }
            System.out.printf("\nСумма от 1 до %s = %s", n, arrSum);
            System.out.print("\n");
            System.out.printf("Произведение чисел от 1 до %s = %s", n, arrMulti);
        } else {
            System.out.print("Число должно быть больше 0 !");
        }
        scanner.close();
    }
}
