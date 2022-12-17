/*1.Реализовать алгоритм сортировки слиянием*/
package HW_3;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] randomList = new int[10];
        for (int i = 0; i < 10; i++) {
            randomList[i] = ((int) (Math.random() * 100));
        }
        System.out.println("Исходный массив:  " + Arrays.toString(randomList));

        sortArray(randomList);
        System.out.println("После сортировки: " + Arrays.toString(randomList));
    }

    public static void sortArray(int[] arrayList) {
        if (arrayList.length < 2) {
            return;
        }
        int[] arrayList2 = new int[arrayList.length / 2];
        System.arraycopy(arrayList, 0, arrayList2, 0, arrayList.length / 2);

        int[] arrayList3 = new int[arrayList.length - arrayList.length / 2];
        if (arrayList.length - arrayList.length / 2 >= 0)
            System.arraycopy(arrayList, arrayList.length / 2, arrayList3, 0, arrayList.length - arrayList.length / 2);

        sortArray(arrayList2);
        sortArray(arrayList3);

        mergeArray(arrayList, arrayList2, arrayList3, arrayList.length / 2, arrayList.length - arrayList.length / 2);
    }

    public static void mergeArray(int[] arrList, int[] arrayList1, int[] arrayList2, int len1, int len2) {
        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (arrayList1[i] <= arrayList2[j]) {
                arrList[k++] = arrayList1[i++];
            } else {
                arrList[k++] = arrayList2[j++];
            }
        }
        while (i < len1) {
            arrList[k++] = arrayList1[i++];
        }
        while (j < len2) {
            arrList[k++] = arrayList2[j++];
        }
    }
}
