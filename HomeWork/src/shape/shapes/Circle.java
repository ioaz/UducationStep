package shape.shapes;

import shape.interfaces.AreaShape;
import shape.Shape;

/**
 * Created by ioa on 24.04.17.
 */
public class Circle extends Shape implements AreaShape {
    public Circle(double r){
        this.r = r;
    }

    @Override
    public double getArea() {
        System.out.print("Circle area: ");
        return PI * Math.pow(r, 2);
    }

    @Override
    public double getPerimeter() {
        System.out.print("Circle perimeter: ");
        return 2 * PI * r;
    }
}
