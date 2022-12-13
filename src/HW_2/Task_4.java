/*4*. К калькулятору из предыдущего дз добавить логирование.*/
package HW_2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task_4 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Калькулятор");
        FileHandler fh;
        logger.setUseParentHandlers(false);

        String res_log = calculator();

        try {
            fh = new FileHandler("src/HW_2/log_calc.log", true);
            logger.addHandler(fh);
            fh.setFormatter(new SimpleFormatter());
            logger.info("Расчет: " + res_log);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static String calculator() {
        String res_log;
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
                return null;
        }
        res_log = a + " " + s + " " + b + " = " + res;

        System.out.printf("\nРезультат : %s %s %s = %s", a, s, b, res);
        return res_log;
    }
}


