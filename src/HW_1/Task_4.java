/*4.*+Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.*/
package HW_1;

public class Task_4 {

    public static void main(String[] args) {
        String[] first = {"20", "?"};
        String[] second = {"?", "5"};
        int e = 69;
        boolean f = false;

        for (int i = 0; i < 10; i++) {
            int q = Integer.parseInt(first[0]) + i;
            for (int j = 10; j < e - q; j += 10) {
                int w = Integer.parseInt(second[1]) + j;
                if (q + w == e) {
                    System.out.printf("Решено. Первое слагаемое: %s , второе слагаемое: %s\n", q, w);
                    System.out.printf("%s + %s = %s ", q, w, e);
                    f = true;
                    break;
                }
            }
            if (f) {
                break;
            }
        }
        if (!f) {
            System.out.print("Решения нет!");
        }
    }
}
