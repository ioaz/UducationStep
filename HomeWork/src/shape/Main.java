package from40417;

/**
 * Created by ioa on 04.04.17.
 */
//interface Shape{
//    int getPerimeter();
//    int getArea();
//}

interface HasSquare{
    double getArea();
    double getPerimeter();
}
interface HasCyrcle{
    double PI = 3.14;
    double getArea();
}
interface HasRectangle{
    double getArea();
    double getPerimeter();
}
interface Parallelogram{

}
interface Body {

}

public class Manual {
    public static void main(String[] args) {
        Square square = new Square(6);
        Rectangle rectangle = new Rectangle(3,5);
        Cyrcle cyrcle = new Cyrcle(4.6);

        System.out.println("Square perimeter: " + square.getPerimeter());
        System.out.println("Square area: " + square.getArea());

        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle area: " + rectangle.getArea());

        System.out.println("Cyrcle area: " + cyrcle.getArea());

//        Оператор instanceof сравнивает объект с указанным типом.
//        Вы можете использовать его, чтобы проверить, является ли
//        объект экземпляром класса, экземпляром подкласса или экземпляром
//        класса, который реализует определенный интерфейс.

        if (square instanceof HasRectangle){
            System.out.println("square - object type is Square");
        }
        if (rectangle instanceof Rectangle){
            System.out.println("square - object type is Rectangle");
        }
        if (cyrcle instanceof Cyrcle){
            System.out.println("rectangle - object type is Square");
        }
//        if (rectangle instanceof Rectangle){
//            System.out.println("rectangle - object type is Rectangle");
//        }

    }
}



