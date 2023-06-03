package oop.nested;

abstract class Shape {
    protected double length;
    protected double width;

    Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    abstract double area();

}
