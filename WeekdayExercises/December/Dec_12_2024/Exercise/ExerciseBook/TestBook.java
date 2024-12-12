public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Of Cat and Dog", "myself", 0.1);
        Book book2 = new Book("Of Mice and Men", "John Steinbeck", 21);

        //String printString = "Title: " + title + ", Author: " + author + ", Price: $" + price;
        String str1 = book1.toString();
        String str2 = book2.toString();
        System.out.println(str1);
        System.out.println(str2);

        book1.display();
        book2.display();
    }
}
