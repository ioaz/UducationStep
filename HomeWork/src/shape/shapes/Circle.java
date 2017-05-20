package shape.shapes;

import shape.interfaces.AreaAndPerimeter;
import shape.Shape;
import shape.interfaces.Resizable;


/**
 * Created by ioa on 24.04.17.
 */
public class Circle extends Shape implements AreaAndPerimeter, Resizable{
    public Circle(double r){
        name = "Circle";
        this.r = r;
    }

    @Override
    public double getArea() {
        //System.out.print("Circle area: ");
        return PI * Math.pow(r, 2);
    }

    @Override
    public double getPerimeter() {
        //System.out.print("Circle perimeter: ");
        return 2 * PI * r;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSize() {
        return r;
    }

    @Override
    public void multiply(double factor) {
        r *= factor;
    }

    @Override
    public void add(double term) {
        r += term;
    }
}
