package shape.shapes;

import shape.interfaces.SurfaceAreaAndVolume;
import shape.Shape;

/**
 * Created by ioa on 24.04.17.
 */
public class Sphere extends Shape implements SurfaceAreaAndVolume {

    public Sphere(double r){
        name = "Sphere";
        this.r = r;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * Math.pow(r,2);
    }

    @Override
    public double getVolume() {
        return (4/3) * PI * Math.pow(r,3);
    }

    @Override
    public String getName() {
        return name;
    }

}
