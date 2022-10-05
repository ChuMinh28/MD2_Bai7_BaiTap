package bai7.baitap2;

public class Main {
    public static void main(String[] args) {
        Shape2[] shape2s = new Shape2[3];
        shape2s[0] = new Circle2(3,"green",true);
        shape2s[1] = new Rectangle2(3,4);
        shape2s[2] = new Square(4);
        for (Shape2 shape2 : shape2s) System.out.println(shape2);
        System.out.println("=================");
        for (Shape2 shape2 : shape2s) {
            System.out.println(shape2);
            shape2.howToColor();
        }

    }
}
