import java.util.*;

public class s3_t2 {
    public static void main(String[] args) {
        String planets = null;
        List<String> planet = List.of("Марс", "Юпитер", "Венера", "Земля", "Юпитер", "Венера", "Земля");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(planet.get((int) (Math.random() * 5)));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) != list.get(i + 1)) {
                System.out.print(Collections.frequency(list, list.get(i)) + " ");
            }
        }
        System.out.print(Collections.frequency(list, list.get(list.size() - 1)) + " ");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            if (Collections.frequency(list, iterator.next()) > 1) {
                iterator.remove();
            }
        }
        System.out.println(list);    }
}
