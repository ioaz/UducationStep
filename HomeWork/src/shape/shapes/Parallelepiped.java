package shape.shapes;

import shape.interfases.BodyShape;
import shape.Shape;

/**
 * Created by ioa on 24.04.17.
 */
public class Parallelepiped extends Shape implements BodyShape {

    public Parallelepiped(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getSurfaceArea() {
        return 2*(a*b + a*c + b*c);
    }

    @Override
    public double getVolume() {
        return a * b * c;
    }
}
