package org.example.B5;

public class TestMain {
    public static void main(String[] args) {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(inv1);
        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1);
        System.out.println("id là: " + inv1.getId());
        System.out.println("desc là: " + inv1.getDesc());
        System.out.println("qty là: " + inv1.getQty());
        System.out.println("unitPrice là: " + inv1.getUnitPrice());
        System.out.println("Tổng số là: " + inv1.getTotal());
    }
}