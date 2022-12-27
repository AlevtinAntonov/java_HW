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
import com.sun.source.doctree.SeeTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Main {
    private static String noteBooksFile = "src/HW_6/notebooks.csv";

    public static void main(String[] args) throws IOException {
        ArrayList<NoteBooks> noteBooks = loadNoteBooksFromFile();
        System.out.println(noteBooks);
//        createSet();
    }

    private static ArrayList<NoteBooks> loadNoteBooksFromFile() throws IOException {
        ArrayList<NoteBooks> noteBooks = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(noteBooksFile));
            for (String line : lines) {
                String[] fragments = line.split(";");
                if (fragments.length != 10) {
                    System.out.println("Неправильный размер строки" + line);
                    continue;
                }
                noteBooks.add(new NoteBooks(
                        Integer.parseInt(fragments[0]),
                        fragments[1],
                        fragments[2],
                        fragments[3],
                        fragments[4],
                        fragments[5],
                        fragments[6],
                        Double.parseDouble(fragments[7]),
                        fragments[8],
                        fragments[9]
                ));
            }

        } catch (Exception ex){
            ex.printStackTrace();
        }
        return noteBooks;
    }

    public static void createSet(){
        NoteBooks noteBooks_1 = new NoteBooks(1000143954,"HP","620","1366x768","Intel Core 2 Duo T6670","2048Mb","320Gb",
                48253,"Windows 10","silver");
        NoteBooks noteBooks_2 = new NoteBooks(1000143955,"HP","620","1366x768","Intel Core 2 Duo T6670","2048Mb","320Gb",
                48253,"Windows 10","silver");
        NoteBooks noteBooks_3 = new NoteBooks(1000143956,"HP","620","1366x768","Intel Core 2 Duo T6670","2048Mb","320Gb",
                48253,"Windows 10","silver");
        NoteBooks noteBooks_4 = new NoteBooks(1000143957,"HP","620","1366x768","Intel Core 2 Duo T6670","2048Mb","320Gb",
                48253,"Windows 10","silver");

        Set<NoteBooks> noteBooksSet = new HashSet();
        noteBooksSet.add(noteBooks_1);
        noteBooksSet.add(noteBooks_2);
        noteBooksSet.add(noteBooks_3);
        noteBooksSet.add(noteBooks_4);

        System.out.println(noteBooksSet);
    }
}