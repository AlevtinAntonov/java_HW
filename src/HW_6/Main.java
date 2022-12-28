package HW_6;
/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Main {
    private static final String noteBooksFile = "src/HW_6/notebooks.csv";

    public static void main(String[] args) throws IOException {
        Set<NoteBooks> noteBooksSet = loadNoteBooksFromFile();
        NoteBooks filterNotebooks = new NoteBooks();
        System.out.println(filterNotebooks.filter(noteBooksSet));

    }


    private static Set<NoteBooks> loadNoteBooksFromFile() {
        Set<NoteBooks> noteBooksSet = new HashSet<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(noteBooksFile));
            for (String line : lines) {
                String[] fragments = line.split(";");
                if (fragments.length != 9) {
                    System.out.println("Неправильный размер строки" + line);
                    continue;
                }
                NoteBooks noteBooks = new NoteBooks(fragments[0], fragments[1], fragments[2], fragments[3],
                        fragments[4], fragments[5], Double.parseDouble(fragments[6]), fragments[7], fragments[8]);
                noteBooksSet.add(noteBooks);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return noteBooksSet;
    }
}