package shape;

/**
 * Created by ioa on 24.04.17.
 */
public class Sphere extends Shape implements BodyShape {

    Sphere(double r){
        this.r = r;
    }

    @Override
    public double getSurfaceArea() { // площадь поверхности
        return 4 * PI *Math.pow(r,2);
    }

    @Override
    public double getVolume() { // Объем
        return (4/3) * PI * Math.pow(r,3);
    }

}
