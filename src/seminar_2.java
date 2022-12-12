import java.util.Arrays;

public class seminar_2 {
    public static void main(String[] args) {
        String str = "aacbxbcaa";
        StringBuilder result = new StringBuilder();
        boolean f = true;
        for (int i = 0; i < str.length() / 2; i++) {
            char var1 = str.charAt(i);
            char var2 = str.charAt(str.length()-1-i);
            if (var1 == var2){
            } else {
                System.out.printf("Выражение %s Это не полиндром", str);
                f = false;
                break;
            }
        }
        if (f){
            System.out.printf("Выражение %s - полиндром", str);
        }

    }

//    public static String resolve(int n, char a, char b) {
//        //4 abab
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            stringBuilder.append(a).append(b);
//        }
//        return stringBuilder.toString();
//    }
    /* Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd. -> 4a3b1c2d*/

}
