/*2.Пусть дан произвольный список целых чисел, удалить из него четные числа*/
package HW_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add((int) (Math.random() * 100));
        }
        System.out.println("Исходный массив:  " + arrayList);
        Iterator iterator = arrayList.iterator();

        for (Iterator i = iterator; i.hasNext(); ) {
            if (((int) i.next() % 2) == 0) {
                i.remove();
            }
        }
        System.out.println("Массив нечетных чисел:  " + arrayList);

    }
}
