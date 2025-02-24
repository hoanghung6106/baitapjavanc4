package org.example.b2_8;
public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(0, 0, 5);
        System.out.println(circle1);
        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Circumference of circle1: " + circle1.getCircumference());

        MyCircle circle2 = new MyCircle(new MyPoint(3, 4), 3);
        System.out.println(circle2);
        System.out.println("Area of circle2: " + circle2.getArea());
        System.out.println("Circumference of circle2: " + circle2.getCircumference());

        System.out.println("Distance between circle1 and circle2: " + circle1.distance(circle2));

        MyCircle defaultCircle = new MyCircle();
        System.out.println(defaultCircle);
        System.out.println("Area of default circle: " + defaultCircle.getArea());
        System.out.println("Circumference of default circle: " + defaultCircle.getCircumference());
    }
}

