package bai7.baitap2;

public class Square extends Shape2 implements IColorable{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "A Square has a side ="
                + getSide()
                + ", which is a subclass of "
                + super.toString()
                + " Area = " +
                + getArea();
    }
    double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
