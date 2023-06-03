package oop.nested;

import static java.lang.System.*;

public class Triangle extends Shape {

    Triangle(double height, double width) {
        super(height, width);
    }

    @Override
    double area() {
        out.println("Площадь треугольника");
        return 0.5 * length * width;
    }
}
