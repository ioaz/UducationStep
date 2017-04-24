package shape.shapes;

import shape.interfases.*;
import shape.Shape;

/**
 * Created by ioa on 24.04.17.
 */
public class Square extends Shape implements AreaShape {

    public Square(int a){
        this.a = a;
    }
    @Override
    public double getPerimeter(){
        return 4 * a;
    }
    @Override
    public double getArea(){
        return a * a;
    }

}