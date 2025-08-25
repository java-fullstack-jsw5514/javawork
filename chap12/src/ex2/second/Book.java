package ex2.second;

import java.util.Objects;

public class Book implements Comparable<Book>{
    String title;
    String author;
    String category;
    int price;

    public Book() {
    }
    public Book(String title, String author, String category, int price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("제목: %s / 저자: %s / 범주: %s / 가격: %s", title, author, category, price);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(price);
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}
