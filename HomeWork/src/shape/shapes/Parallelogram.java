package shape;

/**
 * Created by ioa on 24.04.17.
 */
public class Parallelogram extends Shape implements AreaShape{

    double h;

    Parallelogram (double a, double b, double h){
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
}
