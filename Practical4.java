import java.util.*;

class Book implements Comparable<Book> {
    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public int compareTo(Book b) {
        return this.title.compareTo(b.title);
    }

    public String toString() {
        return title + " (" + price + ")";
    }
}

class A2P4 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java", 450.0));
        books.add(new Book("C++", 300.0));
        books.add(new Book("Python", 500.0));

        Collections.sort(books);
        System.out.println("Sorted by Title (Comparable): " + books);

        books.sort(Comparator.comparingDouble(b -> b.price));
        System.out.println("Sorted by Price (Comparator): " + books);
    }
}
