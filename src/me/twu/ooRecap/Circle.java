package me.twu.ooRecap;

public class Circle implements Shape{
    private final float radius;
    private final static float Pi =  3.14f;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Pi * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Pi * radius;
    }
}
