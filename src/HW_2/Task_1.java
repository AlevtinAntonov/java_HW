/*Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}*/
package HW_2;

import java.util.Map;
import java.util.Objects;

public class Task_1 {
    public static void main(String[] args) {
        Map<String, String> hashmap = Map.ofEntries(
                Map.entry("name", "Ivanov"),
                Map.entry("country", "Russia"),
                Map.entry("city", "Moscow"),
                Map.entry("age", "null")
        );
        System.out.printf("SELECT * FROM students WHERE %s", getQuery(hashmap));
    }

    public static String getQuery(Map<String, String> parameters) {
        StringBuilder result = new StringBuilder();
        if (parameters == null || parameters.isEmpty())
            return result.toString();

        for (Map.Entry<String, String> entry : parameters.entrySet()) {
            if (Objects.equals(entry.getKey(), "null") || Objects.equals(entry.getValue(), "null"))
                continue;
            result.append(entry.getKey()).append(" = '").append(entry.getValue()).append("' AND ");
        }

        if (result.length() > 5)
            result.delete(result.length() - 5, result.length());

        return result.toString();
    }
}

