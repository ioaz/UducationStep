package from_070417;

/**
 * Created by ioa on 07.04.17.
 */
public class Circle {
    int radius;
    String name = "Circle";

    Circle() {
        radius = 6;
        name = "constructed circle";
    }
    Circle(int radius) {
        this.radius = radius;
    }
}
