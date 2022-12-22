/*** Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения. */
package HW_4;

import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Task_4 {

    public static void main(String[] args) {
        String s;
//        s = "((1+(2*3))*2)+(4+2)*2/4+1/4";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение без пробелов: ");
        s = scanner.next();
        System.out.println("Результат: " + s + " = " + eval(s));
    }

    static boolean isSeparator(char c) {
        return c == ' ';
    }

    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    static int priority(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    static void processOperator(LinkedList<Double> st, char op) {
        double r = st.removeLast();
        double l = st.removeLast();
        switch (op) {
            case '+':
                st.add(l + r);
                break;
            case '-':
                st.add(l - r);
                break;
            case '*':
                st.add(l * r);
                break;
            case '/':
                st.add(l / r);
                break;
        }
    }

    public static double eval(String s) {
        LinkedList<Double> st = new LinkedList<>();
        LinkedList<Character> op = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isSeparator(c))
                continue;
            if (c == '(')
                op.add('(');
            else if (c == ')') {
                while (op.getLast() != '(')
                    processOperator(st, op.removeLast());
                op.removeLast();
            } else if (isOperator(c)) {
                while (!op.isEmpty() && priority(op.getLast()) >= priority(c))
                    processOperator(st, op.removeLast());
                op.add(c);
            } else {
                StringBuilder operand = new StringBuilder();
                while (i < s.length() && Character.isDigit(s.charAt(i)))
                    operand.append(s.charAt(i++));
                --i;
                st.add(parseDouble(operand.toString()));
            }
        }
        while (!op.isEmpty())
            processOperator(st, op.removeLast());
        return st.get(0);
    }

}
