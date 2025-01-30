package TaskCollection.Books;



public class Main {
    public static void main(String[] args) {
        BookStore store = new BookStore();

        store.addBook("1984", new Book("1984", 15.99, "George Orwell"));
        store.addBook("To Kill a Mockingbird", new Book("To Kill a Mockingbird", 10.99, "Harper Lee"));
        store.addBook("The Great Gatsby", new Book("The Great Gatsby", 12.99, "F. Scott Fitzgerald"));

        store.printEntrySet();
        store.printKeySet();
        store.printValues();
    }
}
