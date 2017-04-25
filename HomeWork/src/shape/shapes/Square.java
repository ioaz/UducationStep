package shape.shapes;

import shape.interfaces.*;
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
        System.out.print("Square perimeter: ");
        return 4 * a;
    }
    @Override
    public double getArea(){
        System.out.print("Square area: ");
        return a * a;
    }

}