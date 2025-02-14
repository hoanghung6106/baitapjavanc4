package org.example.B1;
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Hình tròn 1: Bán kính = " + c1.getRadius() + ", Diện tích = " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("Hình tròn 2: Bán kính = " + c2.getRadius() + ", Diện tích = " + c2.getArea());
    }
}
