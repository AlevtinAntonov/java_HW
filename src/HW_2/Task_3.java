/*Дана json строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder,
создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.*/
package HW_2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task_3 {
    public static String readFile(String path, Charset encoding) throws IOException {
        return Files.readString(Paths.get(path), encoding);
    }

    public static void main(String[] args) {
        String filePath = "src/HW_2/data.json";

        String content = null;
        try {
            content = readFile(filePath, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] splitString = content.split("\"");

        List<String> str = new ArrayList<>(Arrays.asList(splitString));
        str.removeAll(Arrays.asList("[{", ":", ",", "}, {", "}]"));

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).equals("фамилия")) {
                builder.append("\nСтудент ").append(str.get(i + 1)).append(" ");
                if (str.get(i + 2).equals("оценка")) {
                    builder.append("получил ").append(str.get(i + 3)).append(" ");
                    if (str.get(i + 4).equals("предмет")) {
                        builder.append("по предмету ").append(str.get(i + 5)).append(".");
                    }
                }
            }
        }
        System.out.println(builder);
    }
}
