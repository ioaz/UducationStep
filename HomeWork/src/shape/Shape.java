package shape;

import shape.interfaces.AreaAndPerimeter;

/**
 * Created by ioa on 24.04.17.
 */
public class Shape  {
    public final double PI = 3.14;
    public String name;
    public double a; // length
    public double b; // width
    public double c; // height
    public double r; // radius
    public double h; // sin(a)

    public String getName() {
        return null;
    }
    public double getSize(){
        return 0;
    }
    public static void printShape(AreaAndPerimeter shape){

    }
//    public static void printShape(Shape shape){
//        System.out.println("Volume of the " + shape.getName() + ": " + shape.getVolume());
//        System.out.println("The surface area of the " + shape.getName() +
//                ": " + shape.getSurfaceArea());
//        System.out.println();
//    }
}