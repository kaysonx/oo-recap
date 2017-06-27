package me.twu.ooRecap;


public class Rectangle implements Shape{

    protected final double length;
    protected final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return  this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    public static Rectangle makeSquare(double width){
        return new Rectangle(width,width);
    }
}
