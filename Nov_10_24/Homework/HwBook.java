class HwBook {
   String title;
   String author;
   int pages; 

//    public void setTitle(String title){
//     this.title = title;
//    }

//    public void setAuthor(String author){
//     this.author = author;
//    }

//    public void setPages(int pages){
//     this.pages = pages;
//    }
    public void setDetail(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void displayInfo() {
        System.out.println(title + " " + author + " " + pages);
    }

   public static void main(String[] args) {
    HwBook newBook = new HwBook();

    newBook.setDetail("Hello", "Goodbye", 23);
 
    newBook.displayInfo();
   }
}