package TaskCollection.Books;

import java.util.HashMap;
import java.util.Map;

public class BookStore   {
    private HashMap<String, Book> bookMap;

    public BookStore() {
        bookMap = new HashMap<>();
    }

public void addBook(String name, Book book) {
        bookMap.put(name, book);
        }

public void printEntrySet() {
        System.out.println("Используя entrySet():");
        for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
        System.out.println("Книга: " + entry.getKey() + ", " + entry.getValue());
        }
        }

public void printKeySet() {
        System.out.println("\nИспользуя keySet():");
        for (String name : bookMap.keySet()) {
        System.out.println("Имя книги: " + name);
        }
        }

public void printValues() {
        System.out.println("\nИспользуя values():");
        for (Book book : bookMap.values()) {
        System.out.println("Книга: " + book);
        }
        }
}
