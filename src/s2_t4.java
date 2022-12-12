/*
Напишите метод, который вернет содержимое текущей папки в виде массива строк.
Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл. */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class s2_t4 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(s2_t4.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("log.log");
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
        logger.log(Level.WARNING, "Test logging");
        String[] srcs = readDir("src");
        System.out.println(Arrays.toString(srcs));
        writeFiles(srcs);
    }

    public static String[] readDir(String folder) {
        File dir = new File(folder);
        File[] list = dir.listFiles();
        String[] filenames = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            filenames[i] = list[i].getName();
        }
        return filenames;
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
