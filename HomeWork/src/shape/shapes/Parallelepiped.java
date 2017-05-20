package shape.shapes;

import shape.interfaces.SurfaceAreaAndVolume;
import shape.Shape;

/**
 * Created by ioa on 24.04.17.
 */
public class Parallelepiped extends Shape implements SurfaceAreaAndVolume {

    public Parallelepiped(double a, double b, double c){
        name = "Parallelepiped";
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

    @Override
    public String getName() {
        return name;
    }
}
