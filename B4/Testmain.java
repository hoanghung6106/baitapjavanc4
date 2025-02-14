package org.example.B4;

public class Testmain {
    public static void main(String[] args) {
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1);
        e1.setSalry(999);
        System.out.println(e1)   ;
        System.out.println("id là: " + e1.getId());
        System.out.println("firstname là: " + e1.getFirstName());
        System.out.println("lastname là: " + e1.getLastName());
        System.out.println("salary là: " + e1.getSalry());
        System.out.println("name là: " + e1.getName());
        System.out.println("annual salary là: " + e1.getAnnualSalary());
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }

}