import java.util.*;

public class s_3_t1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0 ; i < 10; i++){
            integers.add((int)(Math.random()*10));
        }
        System.out.println("Исходный:" + integers);
        Collections.sort(integers);
        System.out.println("Отсортированный:" + integers);


    }
}
