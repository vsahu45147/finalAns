package java_problems_datastructures;
import java.util.HashMap;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Other getter and setter methods

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", author=" + author + ", quantity=" + quantity + "]";
    }
}

public class Library {
    public static void main(String[] args) {
        HashMap<Integer, Book> bookMap = new HashMap<>();

        // Instantiating two Book objects
        Book book1 = new Book(1, "Java Programming", "John Doe", 10);
        Book book2 = new Book(2, "Python Basics", "Jane Smith", 15);

        // Adding books to the HashMap
        bookMap.put(1, book1);
        bookMap.put(2, book2);

        // Displaying the collection of books in the HashMap
        System.out.println("Books in the library:");
        for (Book book : bookMap.values()) {
            System.out.println(book);
        }

        // (a) Check if a particular book name is present in the map
        String bookNameToCheck = "Java Programming";
        boolean containsBook = bookMap.values().stream().anyMatch(b -> b.getName().equals(bookNameToCheck));
        System.out.println("\nIs book \"" + bookNameToCheck + "\" present in the library? " + containsBook);

        // (b) Remove the value associated with a particular key value which will remove the book entry
        int keyToRemove = 2;
        Book removedBook = bookMap.remove(keyToRemove);
        if (removedBook != null) {
            System.out.println("\nBook removed from the library:");
            System.out.println(removedBook);
        } else {
            System.out.println("\nBook not found in the library.");
        }

        // Displaying the updated collection of books in the HashMap
        System.out.println("\nUpdated books in the library:");
        for (Book book : bookMap.values()) {
            System.out.println(book);
        }
    }
}
