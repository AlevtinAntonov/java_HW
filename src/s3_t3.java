import java.util.ArrayList;

public class s3_t3 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();

        objects.add("String");
        objects.add(1);

        for (int i = 0; i < objects.size(); i++){
            if (objects.get(i) instanceof String){
                String s = (String) objects.get(i);
                System.out.println(s.length());
                System.out.println(objects.get(i));
                System.out.println("строка");
            }
            if (objects.get(i) instanceof Integer) {
                String s = (String) objects.get(i);
                System.out.println(objects.get(i));
                System.out.println("Число");
            }
        }
    }
}
