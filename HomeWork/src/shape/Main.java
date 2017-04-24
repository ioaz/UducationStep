package shape;

import shape.shapes.*;
/**
 * Created by ioa on 04.04.17.
 */

public class Main {
    public static void main(String[] args) {
        Square square = new Square(6);
        Rectangle rectangle = new Rectangle(3,5);
        Circle Circle = new Circle(4.6);
        Parallelogram parallelogram = new Parallelogram(5.2,4.7,2.9);
        Sphere sphere = new Sphere(2.5);
        Cube cube = new Cube(4);
        Parallelepiped parallelepiped = new Parallelepiped(5.1,3.5,8.4);

        System.out.println("Square perimeter: " + square.getPerimeter());
        System.out.println("Square area: " + square.getArea());
        System.out.println();
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println();
        System.out.println("Circle area: " + Circle.getArea());
        System.out.println("Circle perimeter: " + Circle.getPerimeter());
        System.out.println();
        System.out.println("Parallelogram area: " + parallelogram.getArea());
        System.out.println("Parallelogram perimeter: " + parallelogram.getPerimeter());
        System.out.println();
        System.out.println("The surface area of the sphere: " + sphere.getSurfaceArea());
        System.out.println("Volume of the sphere : " + sphere.getVolume());
        System.out.println();
        System.out.println("The surface area of the cube: " + cube.getSurfaceArea());
        System.out.println("Volume of the cube: " + cube.getVolume());
        System.out.println();
        System.out.println("The surface area of the parallelepiped: " +
                parallelepiped.getSurfaceArea());
        System.out.println("Volume of the parallelepiped: " + parallelepiped.getVolume());
//        Оператор instanceof сравнивает объект с указанным типом.
//        Вы можете использовать его, чтобы проверить, является ли
//        объект экземпляром класса, экземпляром подкласса или экземпляром
//        класса, который реализует определенный интерфейс.

//        if (square instanceof HasRectangle){
//            System.out.println("square - object type is Square");
//        }
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



