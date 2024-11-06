import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

class BookShop {
    private ArrayList<Book> inventory = new ArrayList<>();

    public void addBook(Book book) {
        inventory.add(book);
    }

    public void display() {
        for (Book book : inventory) {
            book.display();
        }
    }
}

class three {
    public static void main(String[] args) {
        BookShop shop = new BookShop();
        shop.addBook(new Book("C", "Dennis ritchie", 45.99));
        shop.addBook(new Book("C++", "Bjarne Stroustrup", 50.50));
        shop.addBook(new Book("Java", "James Gosling", 70.50));
        shop.display();
    }
}
