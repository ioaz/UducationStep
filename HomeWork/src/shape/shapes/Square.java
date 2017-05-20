package shape.shapes;

import shape.Shape;
import shape.interfaces.AreaAndPerimeter;
import shape.interfaces.Resizable;

/**
 * Created by ioa on 24.04.17.
 */
public class Square extends Shape implements AreaAndPerimeter, Resizable {

    public Square(double a){
        name = "square";
        this.a = a;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSize() {
        return a;
    }

    @Override
    public double getPerimeter(){
        return 4 * a;
    }

    @Override
    public double getArea(){

        return a * a;
    }

    @Override
    public void multiply (double factor) {
        this.a *= factor;
    }

    @Override
    public void add(double term) {
        this.a += term;
    }

}