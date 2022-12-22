/*Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.*/
package HW_4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean b = true;

        while (b) {
            System.out.println("Введите элемент или print или reverse: ");
            String str = scanner.next();
            if (str.contains("print")) {
                printReversedList(linkedList);
                b = false;
            } else if (str.contains("reverse")) {
                printRevreedList2(linkedList);
                b = false;
            }
            linkedList.add(str);
        }
    }

    public static void printReversedList(LinkedList<String> list) {
        LinkedList<String> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        System.out.println(reversedList);
    }

    public static void printRevreedList2(LinkedList<String> list) {
        Collections.reverse(list);
        System.out.println(list);
    }

}
