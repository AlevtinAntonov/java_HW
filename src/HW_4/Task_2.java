/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
(Подобную задачу решали на семинаре. Здесь так же нужно создать класс, который будет реализовывать указанные методы)*/
package HW_4;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        MyLlist myLlist = new MyLlist();

        String str1 = "One";
        String str2 = "Two";
        String str3 = "Three";
        String str4 = "Four";

        myLlist.enqueue(str1);
        myLlist.enqueue(str2);
        myLlist.enqueue(str3);
        myLlist.enqueue(str4);

        String format = "%-25s %s\n";
        System.out.format(format, Arrays.toString(myLlist.linkedList.toArray()), "- enqueue() - помещает элемент " +
                "в конец очереди");
        System.out.format(format, myLlist.dequeue(), "- dequeue() - возвращает первый элемент из очереди и удаляет его");
        System.out.format(format, Arrays.toString(myLlist.linkedList.toArray()), "- массив после dequeue()");
        System.out.format(format, myLlist.first(), "- first() - возвращает первый элемент из очереди, не удаляя");
        System.out.format(format, Arrays.toString(myLlist.linkedList.toArray()), "- массив после first()");

    }
}
