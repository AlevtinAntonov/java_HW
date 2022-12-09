import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class s2_t3 {
    public static void main(String[] args) throws IOException {
        String s = "test";
        File file = new File("text.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            for (int i = 0; i < 1000; i++){
                fw.write(s);
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
