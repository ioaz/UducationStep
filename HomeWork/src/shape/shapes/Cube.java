package shape.shapes;

import shape.interfaces.SurfaceAreaAndVolume;
import shape.Shape;

/**
 * Created by ioa on 24.04.17.
 */
public class Cube extends Shape implements SurfaceAreaAndVolume {

    public Cube(double a){
        name = "Cube";
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

    @Override
    public String getName() {
        return name;
    }
}
