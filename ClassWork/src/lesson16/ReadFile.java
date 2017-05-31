package lesson16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ioa on 30.05.17.
 */
public class ReadFile {
    public static void main(String[] args){

        File file = new File("file.txt");

        try (FileOutputStream out = new FileOutputStream(file, true)){
            out.write("\nHello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
