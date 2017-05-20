package shape.shapes;

import shape.interfaces.AreaAndPerimeter;
import shape.Shape;

/**
 * Created by ioa on 24.04.17.
 */
public class Parallelogram extends Shape implements AreaAndPerimeter {

    public Parallelogram(double a, double b, double h){
        name = "Parallelogram";
        this.a = a;
        this.b = b;
        this.h = h;
    }
    @Override
    public double getArea() {
        return h * a;
    }

    @Override
    public double getPerimeter() {
        return 2 * (b + a);
    }

    @Override
    public String getName() {
        return name;
    }

}
