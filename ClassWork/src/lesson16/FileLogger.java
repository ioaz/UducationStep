package lesson16;

import java.io.*;
import java.util.Date;

/**
 * Created by ioa on 30.05.17.
 */
public class FileLogger implements Logger {

    String userName;

    FileLogger(String name) throws FileNotFoundException {
        userName = name;
    }

    File file = new File("Data.txt");
    FileOutputStream out = new FileOutputStream(file, true);

    @Override
    public void info(String message) throws IOException {
        out.write(String.format("%s (%s): %s\n", userName, new Date(), message).getBytes());
    }

    @Override
    public void error(String message) throws FileNotFoundException {
        try {
            out.write(String.format("%s (%s): %s\n", userName, new Date(), message).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
