public class Book {
    private final String title;
    private final String author;
    private final int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Doe", 500);
        book1.displayInfo();

        Book book2 = new Book("Python Programming", "Jane Smith", 400);
        book2.displayInfo();
    }
}