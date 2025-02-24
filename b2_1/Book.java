package org.example.b2_1;

public class Book {
    private String title;
    private Author author;
    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthorName() {
        return author.getName();
    }
    public String getAuthorEmail() {
        return author.getEmail();
    }
    public String getAuthorGender() {
        return author.getGender();
    }
}
