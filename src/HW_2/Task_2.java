/*Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.*/
package HW_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task_2.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.log");
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
        logger.log(Level.WARNING, "=== Логирование сортировки пузырьком ===");
        String[] log_result;

        Random random;
        random = new Random();
        int[] array = random.ints(10, 1,100).toArray();
        System.out.printf("Исходный массив: %s", Arrays.toString(array));

        log_result = new String[]{Arrays.toString(array)};
        writeFiles(log_result);


        boolean isSorted = false;
        int tmp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
        }
        System.out.printf("\nОтсортированный массив: %s", Arrays.toString(array));
//        log_result = log_result + " " + Arrays.toString(array);
    }
    public static void writeFiles(String[] srcs) throws IOException {

        File file = new File("res.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            for (int i = 0; i < srcs.length; i++) {
                fw.write(srcs[i] + "\n");
            }

        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (fw != null) {
                fw.close();
            }
        }
    }
}
