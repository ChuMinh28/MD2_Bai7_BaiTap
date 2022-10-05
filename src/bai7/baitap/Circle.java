package bai7.baitap;

public class Circle extends Shape implements IResizeable{
    private double radius = 1.0;
    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    @Override
    public String toString(){
        return " A circle with radius = "
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius*percent;
    }
}
