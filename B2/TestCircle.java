package org.example.B2;
public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c);
        Circle c1 = new Circle(2);
        System.out.println(c1);
        c1.setRadius(5);
        System.out.println(c1);
        System.out.println("ban kinh la "+c1.getRadius());
        System.out.printf("dien tich la %.2f%n ",c1.getArea());
        System.out.printf("chu vi la %.2f%n",c1.getCircumference());
    }
}