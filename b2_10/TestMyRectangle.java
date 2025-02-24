package org.example.b2_10;
public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(1, 5);
        MyPoint p2 = new MyPoint(5, 1);

        MyRectangle rectangle = new MyRectangle(p1, p2);

        System.out.println(rectangle);
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
    }
}
