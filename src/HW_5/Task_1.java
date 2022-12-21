/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что
1 человек может иметь несколько телефонов*/
package HW_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Task_1 {
    static HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {

        boolean f = true;
        String key = null;
        String value = null;
        while (f) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ведите фамилию и имя: ");
            key = scanner.nextLine();
            System.out.println("Введите телефон: ");
            value = scanner.nextLine();
            addContact(key, value);
            System.out.println("Продолжить ввод - y: ");
            String s = scanner.nextLine();
            if (!(Objects.equals(s, "y"))) f = false;
        }
        System.out.println("Справочник: "+ phoneBook);
    }

    private static void addContact(String key, String value) {
        if (phoneBook.containsKey(key)) {
            phoneBook.get(key).add(value);
        } else {
            ArrayList<String> arrayList = new ArrayList<>(1);
            arrayList.add(value);
            phoneBook.put(key, arrayList);
        }
        System.out.println("Запись добавлена: " + phoneBook);
    }
}
