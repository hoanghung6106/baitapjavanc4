package org.example.b3_1;
import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phức 1 (phần thực và phần ảo): ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        MyComplex c1 = new MyComplex(real1, imag1);
        System.out.print("Nhập số phức 2 (phần thực và phần ảo): ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        MyComplex c2 = new MyComplex(real2, imag2);
        System.out.println("\nSố 1 là: " + c1);
        System.out.println(c1 + (c1.isReal() ? " là" : " KHÔNG phải là") + " số thực");
        System.out.println(c1 + (c1.isImaginary() ? " là" : " KHÔNG phải là") + " số ảo");

        System.out.println("\nSố 2 là: " + c2);
        System.out.println(c2 + (c2.isReal() ? " là" : " KHÔNG phải là") + " số thực");
        System.out.println(c2 + (c2.isImaginary() ? " là" : " KHÔNG phải là") + " số ảo");

        System.out.println("\n" + c1 + (c1.equals(c2) ? " bằng " : " KHÔNG bằng ") + c2);

        MyComplex sum = c1.addNew(c2);
        System.out.println(c1 + " + " + c2 + " = " + sum);

        MyComplex diff = c1.subtractNew(c2);
        System.out.println(c1 + " - " + c2 + " = " + diff);

        MyComplex product = new MyComplex(c1.getReal(), c1.getImag()).multiply(c2);
        System.out.println(c1 + " * " + c2 + " = " + product);

        MyComplex quotient = new MyComplex(c1.getReal(), c1.getImag()).divide(c2);
        System.out.println(c1 + " / " + c2 + " = " + quotient);

        System.out.println("|" + c1 + "| = " + c1.magnitude());
        System.out.println("arg(" + c1 + ") = " + c1.argument());

        MyComplex conjugate1 = new MyComplex(c1.getReal(), c1.getImag()).conjugate();
        System.out.println("Liên hợp của " + c1 + " là " + conjugate1);

        scanner.close();
    }
}
