package shape.shapes;

import shape.interfases.BodyShape;
import shape.Shape;

/**
 * Created by ioa on 24.04.17.
 */
public class Cube extends Shape implements BodyShape {

    public Cube(double a){
        this.a = a;
    }
    @Override
    public double getSurfaceArea() {
        return 6 * Math.pow(a,2);
    }

    @Override
    public double getVolume() {
        return Math.pow(a,3);
    }
}
