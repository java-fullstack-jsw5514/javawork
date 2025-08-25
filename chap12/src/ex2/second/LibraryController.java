package ex2.second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LibraryController {
    ArrayList<Book> books = new ArrayList<Book>();
    
    LibraryController() {
        books.add(new Book("신곡", "단테", "소설", 2000));
        books.add(new Book("파우스트","괴테","희곡",10000));
        books.add(new Book("신데렐라","안데르센","동화",1000));
    }
    void insertBook(Book book) {
        books.add(book);
    }
    public ArrayList<Book> selectList() {
        return books;
    }
    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if(book.getTitle().contains(keyword)){
                result.add(book);
            }
        }
        return result;
    }
    public Book deleteBook(String title, String author) {
        ArrayList<Book> marked = new ArrayList<>();
        for (Book book : books) {
            if(book.getTitle().equals(title) && book.getAuthor().equals(author)){
                marked.add(book);
            }
        }
        for (Book book : marked) {
            books.remove(book);
        }
        return marked.get(0);
    }
    public int ascBook() {
        Collections.sort(books);
        return 1;
    }
    public void ascTitle() {
        Collections.sort(books,new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Book book : books) {
            result.append(book);
            result.append("\n");
        }
        return result.toString();
    }
}
