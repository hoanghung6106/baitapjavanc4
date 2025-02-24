package org.example.b2_2;
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
    @Override
    public String toString() {
        StringBuilder authorDetails = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorDetails.append(authors[i].toString());
            if (i < authors.length - 1) {
                authorDetails.append(",");
            }
        }
        return "Book[name=" + name + ",authors={" + authorDetails + "},price=" + price + ",qty=" + qty + "]";
    }
}
