package TaskCollection.Books;

public class Book {
    private String name ;
    private double cost;
    private String author;

    public Book(String name, double cost, String author) {
        this.name = name;
        this.cost = cost;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", author='" + author + '\'' +
                '}';
    }
}
