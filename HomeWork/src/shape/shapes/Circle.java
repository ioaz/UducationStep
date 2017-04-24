package shape.shapes;

import shape.interfases.AreaShape;
import shape.Shape;

/**
 * Created by ioa on 24.04.17.
 */
public class Cyrcle extends Shape implements AreaShape {
    double r;
    public Cyrcle(double r){
        this.r = r;
    }
    @Override
    public double getArea() {
        return PI * Math.pow(r, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * r;
    }
}
