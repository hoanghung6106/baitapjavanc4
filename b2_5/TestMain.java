package org.example.b2_5;
public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Doe", "123 Main St, Springfield", "555-1234");
        System.out.println(customer1);
        customer1.setName("Jane Doe");
        customer1.setAddress("456 Elm St, Springfield");
        customer1.setPhoneNumber("555-5678");
        System.out.println(customer1);
        Account account1 = new Account(customer1, 1000.0);
        System.out.println(account1);  // Account's toString()

        account1.deposit(500.0);
        account1.withdraw(200.0);
        Customer customer2 = new Customer("Alice Smith", "789 Oak St, Springfield", "555-9876");
        Account account2 = new Account(customer2, 500.0);
        account1.transfer(account2, 300.0);
        System.out.println(account1);
        System.out.println(account2);
    }
}
