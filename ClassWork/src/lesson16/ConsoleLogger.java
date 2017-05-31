package lesson16;

import java.io.*;
import java.util.Date;

/**
 * Created by ioa on 30.05.17.
 */
public class ConsoleLogger implements Logger {

    String userName;

    ConsoleLogger(String name) {
        userName = name;
    }

    @Override
    public void info(String message) throws IOException {
        System.out.println(String.format("%s (%s): %s", userName, new Date(), message));
    }

    @Override
    public void error(String message) throws FileNotFoundException {
        System.out.println(String.format("%s (%s): %s", userName, new Date(), message));
    }
}
