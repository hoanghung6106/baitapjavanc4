package org.example.b3_1;
public class TestMyComplex {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(1.1, 2.2);
        MyComplex c2 = new MyComplex(3.3, 4.4);

        System.out.println("Số 1 là: " + c1);
        System.out.println(c1 + (c1.isReal() ? " là" : " KHÔNG phải là") + " số thực");
        System.out.println(c1 + (c1.isImaginary() ? " là" : " KHÔNG phải là") + " số ảo");

        System.out.println("\nSố 2 là: " + c2);
        System.out.println(c2 + (c2.isReal() ? " là" : " KHÔNG phải là") + " số thực");
        System.out.println(c2 + (c2.isImaginary() ? " là" : " KHÔNG phải là") + " số ảo");

        System.out.println("\n" + c1 + (c1.equals(c2) ? " bằng " : " KHÔNG bằng ") + c2);

        MyComplex sum = c1.addNew(c2);
        System.out.println(c1 + " + " + c2 + " = " + sum);
    }
}
