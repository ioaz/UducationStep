package vehicle.work0022;

import java.util.Scanner;

/**
 * Created by ioa on 18.03.17.
 *
 * Определить к какой четверти принадлежит точка с координатами (х,у)
 *
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        int x = in.nextInt();
        System.out.print("y = ");
        int y = in.nextInt();
        /*
        1я = y>0;x>0
        2я = y>0;x<0
        3я = y<0;x<0
        4я = y<0;x>0
         */
        if (y>0 && x>0)
            System.out.println("Точка находится в первой четверти");
        else if (y>0 && x<0)
            System.out.println("Точка находится в второй четверти");
        else if (y<0 && x<0)
            System.out.println("Точка находится в третьей четверти");
        else if (y<0 && x>0)
            System.out.println("Точка находится в четвертой четверти");
    }
}
