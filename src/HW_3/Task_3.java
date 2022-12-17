/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.*/
package HW_3;

import java.util.ArrayList;
import java.util.Collections;

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add((int) (Math.random() * 100));
        }
        System.out.println("Исходный массив: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Отсортированный массив: " + arrayList);
        int min = arrayList.get(0);
        int max;
        max = arrayList.get(arrayList.size() - 1);

        int sum = 0;

        for (int item : arrayList) {
            sum += item;
        }
        int middle = sum / arrayList.size();

        int average = middle;
        int min_diff = Integer.MAX_VALUE;

        for (int item : arrayList) {
            final int diff = Math.abs(item - middle);

            if (diff < min_diff) {
                min_diff = diff;
                average = item;
            }
        }
        System.out.println("Минимум - " + min);
        System.out.println("Максимум - " + max);
        System.out.println("Среднее арифметическое в массиве - " + middle);
        System.out.println("Среднее в массиве - " + average);
    }
}

