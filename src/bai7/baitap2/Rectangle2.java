package bai7.baitap2;

public class Rectangle2 extends Shape2{
    private double width = 2.0;
    private double length = 3.0;

    public Rectangle2() {
    }

    public Rectangle2(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle2(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "
                + getWidth()
                + " and length "
                + getLength()
                + " and Area = "
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }
}
