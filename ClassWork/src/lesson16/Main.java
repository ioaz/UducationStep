package lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by ioa on 30.05.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer logOut = null;
        System.out.println("Enter user name: ");
        String name = reader.readLine();
        System.out.println("Select the logging method: \n  1.Console; \n  2.File.\n" +
                "  (To change the log, enter:\n   -'logger console' for output to the console;\n" +
                "   -'logger file' for output to a file;\n" +
                "   -'logger all' for output to a file and console.)");

        while (true) {
            try {
//                logOut = scanner.nextInt();
                logOut = Integer.valueOf(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("You must enter an integer.");
//            } catch (InputMismatchException e) {
//                System.out.println("You must enter an integer.");
//            }
                if (logOut != null)
                    break;
            }

            MultiLogger logger = new MultiLogger(name, logOut);



            exit:
            while (true) {
                String msg = scanner.nextLine();
                switch (msg) {
                    case "exit":
                        logger.error("Выход");
                        break exit;
                    default:
                        logger.info(msg);
                }
            }
        }
    }

}

