/*2. Вывести все простые числа от 1 до 1000*/
package HW_1;

import java.util.ArrayList;

public class Task_2 {
    public static void main(String[] args) {
        int num = 1000;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);

        for (int i = 3; i <= num; i += 2) {
            boolean isPrime = true;
            for (int j = 3; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                list.add(i);
            }
        }
        System.out.print(list);
    }
}
