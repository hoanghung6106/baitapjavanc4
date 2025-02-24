package org.example.b2_9;
public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(4, 0);
        MyPoint p3 = new MyPoint(2, 4);

        MyTriangle triangle = new MyTriangle(p1, p2, p3);

        System.out.println(triangle);

        System.out.println("Perimeter: " + triangle.getPerimeter());

        triangle.printType();
    }
}
