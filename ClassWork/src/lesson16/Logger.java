package lesson16;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by ioa on 30.05.17.
 */
public interface Logger {

    void info(String message) throws IOException;

    void error(String message) throws FileNotFoundException;

}
