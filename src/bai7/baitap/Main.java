package bai7.baitap;

public class Main {
    public static void main(String[] args) {
        System.out.println("kich thuoc truowc khi doi");
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("kich thuoc sau khi doi");
        for (Shape shape : shapes) {
            shape.resize(Math.floor(Math.random()*10));
            System.out.println(shape);
        }
    }
}
