package HW_4;

import java.util.LinkedList;

public class MyLlist {
    LinkedList<String> linkedList;
    int[] array;
    String item;
    int size = 0;
    int index = 0;

    public MyLlist() {
        linkedList = new LinkedList<>();
    }

    public void enqueue(String item) {
        linkedList.add(item);
        size++;
    }

    public int dequeue() {
        size--;

    }

}
/*enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.*/