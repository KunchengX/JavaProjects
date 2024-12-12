package Book;
public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 15.0);
        Book book2 = new Book("The Da Vinci Code", "Dan Brown", 20.0);

        System.out.println(book1);
        System.out.println(book2);

        book1.setTitle("The Kite Runner");
        book1.setAuthor("Khaled Hosseini");
        book1.setPrice(10.0);

        System.out.println(book1);
    }
}

class Book {

    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: $" + price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
