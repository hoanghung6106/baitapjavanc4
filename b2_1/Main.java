package org.example.b2_1;

public class Main {
    public static void main(String[] args) {
        Author author =new Author("J.K. Rowling", "jkrowling@example.com", "Female");
        Book book = new Book("Harry Potter and the Sorcerer's Stone", author);
        System.out.println("Author Name: " + book.getAuthorName());
        System.out.println("Author Email: " + book.getAuthorEmail());
        System.out.println("Author Gender: " + book.getAuthorGender());
    }
}
