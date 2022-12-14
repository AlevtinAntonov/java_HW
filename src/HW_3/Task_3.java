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
        int sum = 0, average, mid, a1 = arrayList.get(0), a2 = arrayList.get(0);

        for (int item : arrayList) {
            sum += item;
        }
        mid = sum / arrayList.size();
        System.out.println(mid);
        for (int item : arrayList) {
            if (item <= mid & item > min) {
                a1 = item;
            }
            if (item >= mid & item < max) {
                a2 = item;
            }
        }
        if (mid - a1 > a2 - mid) {
            average = a2;
        } else {
            average = a1;
        }

        System.out.println("Минимум - " + min);
        System.out.println("Максимум - " + max);
        System.out.println("Среднее в массиве - " + average);


    }
}

