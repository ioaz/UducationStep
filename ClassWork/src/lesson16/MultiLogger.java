package lesson16;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by ioa on 30.05.17.
 */
public class MultiLogger implements Logger {

    String userName;
    int logOut;
    int switchLogOut;

    MultiLogger(String name, int logOut) throws FileNotFoundException {
        userName = name;
        this.logOut = logOut;
    }

    public  void setUserName(String name){
        this.userName = userName;
    }
    public  void getUserName(){

    }

    private ConsoleLogger getConsoleLogger() {
        ConsoleLogger consoleLogger = new ConsoleLogger(userName);
        if (logOut == 1 || (switchLogOut == 3 && logOut == 3)) {
            return consoleLogger;
        }
        return null;
    }

    private FileLogger getFileLogger() {
        FileLogger fileLogger = null;
        try {
            fileLogger = new FileLogger(userName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (logOut == 2 || (switchLogOut == 3 && logOut == 3)) {
            return fileLogger;
        }
        return null;
    }

    void switchLogOut(String msg) {
        if (msg.equals("logger console")) {
            switchLogOut = 1;
            logOut = 1;
        } else if (msg.equals("logger file")) {
            switchLogOut = 2;
            logOut = 2;
        } else if (msg.equals("logger all")) {
            switchLogOut = 3;
            logOut = 3;
        }
    }

    @Override
    public void info(String message) throws IOException {

        switchLogOut(message);

        if (logOut == 1 || switchLogOut == 1)
            getConsoleLogger().info(message);

        else if (logOut == 2 || switchLogOut == 2)
            getFileLogger().info(message);

        else if (logOut == 3 || switchLogOut == 3) {
            getConsoleLogger().info(message);
            getFileLogger().info(message);
        }
    }

    @Override
    public void error(String message) throws FileNotFoundException {
        try {
            if (getConsoleLogger() != null)
                getConsoleLogger().info(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (getFileLogger() != null)
                getFileLogger().info(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
