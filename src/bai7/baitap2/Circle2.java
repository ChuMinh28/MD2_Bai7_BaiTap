package bai7.baitap2;

public class Circle2 extends Shape2{
    private double radius = 1.0;
    public Circle2(){
    }

    public Circle2(double radius) {
        this.radius = radius;
    }
    public Circle2(double radius, String color, boolean filled){
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
        return "A circle with radius = "
                + getRadius()
                +" and Area = "
                +getArea()
                + ", which is a subclass of "
                + super.toString();
    }
}
