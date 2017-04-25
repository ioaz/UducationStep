package shape.shapes;

import shape.interfaces.AreaShape;
import shape.Shape;

/**
 * Created by ioa on 24.04.17.
 */
public  class Rectangle extends Shape implements AreaShape {
    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter(){
        return 2 * (b+a);
    }
}