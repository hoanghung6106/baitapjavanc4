package org.example.b3_2;
public class TestMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(4.4, 5.5, 6.6, 7.7);

        System.out.println("Đa thức 1: " + p1);
        System.out.println("Bậc của đa thức 1: " + p1.getDegree());
        System.out.println("Đa thức 2: " + p2);
        System.out.println("Bậc của đa thức 2: " + p2.getDegree());

        System.out.println("p1(2) = " + p1.evaluate(2));
        System.out.println("p2(2) = " + p2.evaluate(2));

        System.out.println("p1 + p2 = " + p1.add(p2));
        System.out.println("p1 * p2 = " + p1.multiply(p2));
    }
}
