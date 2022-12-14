/*Реализуйте алгоритм сортировки пузырьком числового массива,
результат после каждой итерации запишите в лог-файл.*/
package HW_2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        int[] array = randomArray(10, 1, 100);
        sortedBuble(array);
    }

    public static int[] sortedBuble(int[] array) {
        Logger logger = Logger.getLogger("Сортировка лог");
        FileHandler fh;
        logger.setUseParentHandlers(false);
        try {
            fh = new FileHandler("src/HW_2/log.log", true);
            logger.addHandler(fh);
            fh.setFormatter(new SimpleFormatter());
            logger.info("Исходный массив: " + Arrays.toString(array));
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        boolean isSorted = false;
        int tmp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
                logger.info("Итерацция i=" + i + ", массив: " + Arrays.toString(array));
            }

        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
        return array;
    }

    public static int[] randomArray(int streamSize, int randomNumberOrigin, int randomNumberBound) {
        Random random;
        random = new Random();
        int[] array = random.ints(streamSize, randomNumberOrigin, randomNumberBound).toArray();
        System.out.println("Исходный массив: " + Arrays.toString(array));

        return array;
    }
}
