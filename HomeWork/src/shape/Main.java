package shape;

import shape.shapes.Rectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ioa on 04.04.17.
 */

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Scanner scanner = new Scanner(System.in);

//        Square square = new Square(5);
//        Circle circle = new Circle(4.6);
//        Parallelogram parallelogram = new Parallelogram(5.2,4.7,2.9);
//        Sphere sphere = new Sphere(2.5);
//        Cube cube = new Cube(4);
//        Parallelepiped parallelepiped = new Parallelepiped(5.1,3.5,8.4);

        Rectangle rectangle = new Rectangle(1, 1);

        while (true) {
            try {
                System.out.println("a = ");
                rectangle.a = Integer.parseInt(reader.readLine());
                System.out.println("b = ");
                rectangle.b = Integer.parseInt(reader.readLine());

            } catch (IOException e) {
                e.printStackTrace();
            } catch (InputMismatchException e) {
                System.out.println("You must enter an integer.");
            } catch (NumberFormatException e) {
                System.out.println("You must enter an integer.");
            }


            System.out.println("area: " + rectangle.getArea());
        }
//        printShape(square);
//        square.multiply(2);
//        printShape(square);
//        square.add(5);
//        printShape(square);
//
//        printShape(circle);
//        circle.multiply(2);
//        printShape(circle);

//        printShape(rectangle);
//        printShape(circle);
//        printShape(parallelogram);
//        printShape(sphere);
//        printShape(cube);
//        printShape(parallelepiped);

//        Оператор instanceof сравнивает объект с указанным типом.
//        Вы можете использовать его, чтобы проверить, является ли
//        объект экземпляром класса, экземпляром подкласса или экземпляром
//        класса, который реализует определенный интерфейс.

//        if (circle instanceof AreaShape){
//            System.out.println(circle.getName() + " object type is Square");
//        }
//        else System.out.println("not");
//        if (rectangle instanceof Rectangle){
//            System.out.println("square - object type is Rectangle");
//        }
//        if (Circle instanceof Circle){
//            System.out.println("rectangle - object type is Square");
//        }
//        if (rectangle instanceof Rectangle){
//            System.out.println("rectangle - object type is Rectangle");
//        }

    }




}



