package HW_4;

import java.util.LinkedList;

public class MyLlist {
    LinkedList<String> linkedList;

    public MyLlist() {
        linkedList = new LinkedList<>();
    }

    public void enqueue(String item) {
        linkedList.offer(item);
    }

    public String dequeue() {
        return linkedList.pollFirst();
    }

    public String first() {
        return linkedList.peekFirst();
    }
}
