package from40417;

import java.util.Scanner;

/**
 * Created by ioa on 04.04.17.
 */

public class Manual {

    public static void out(String str) {
        System.out.println(str);
    }

    public static void helpIf(){
      // return ("if else");
    }

    public static void switchman(){
       out("switch(blabla)");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 1;
        out("Справка по: " + "\n1. if \n" + "2. switch");
        while (i>0){
            int s = scanner.nextInt();
            if (s == 1){
            //    ifelse();
            }
            if (s==2){
                switchman();
            }
        }
    }

}
