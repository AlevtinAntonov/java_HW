/*Пусть дан список сотрудников : Иван Иванов (и остальные)
 * Написать программу , которая найдет и выведет повторяющиеся имена с количеством повторений.
 * отсортировать по убыванию популярности*/
package HW_5;

import java.io.*;
import java.util.*;


public class Staff {
    public static void main(String[] args) {
        Map<String, Integer> staffMap = new HashMap<>();
        StringBuilder sb;
        try {
            File file = new File("src/HW_5/staff.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append(";");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] tokens = sb.toString().split(";");
        for (String token : tokens) {
            staffMap.merge(token, 1, Integer::sum);
        }
        Set<StaffWrapper> wordWrappers = convertToSet(staffMap);
        printSet(wordWrappers);
    }

    private static void printSet(Set<StaffWrapper> staffWrappers) {
        for (StaffWrapper staffWrapper : staffWrappers) {
            System.out.println(staffWrapper);
        }
    }

    private static Set<StaffWrapper> convertToSet(Map<String, Integer> staffMap) {
        Set<StaffWrapper> staffSet = new TreeSet<>();
        for (Map.Entry<String, Integer> e : staffMap.entrySet()) {
            staffSet.add(new StaffWrapper(e.getKey(), e.getValue()));
        }
        return staffSet;
    }
}
