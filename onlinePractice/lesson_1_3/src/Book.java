public class Book {
    public String title;
    public int pageCount;
    public int id;
    // parametrized constructor
    public Book(String title, int pageCount) {
        this.title =  title;
        this.pageCount = pageCount;
        System.out.println("2 arg constructor");
    }
    public Book(int id,String title, int pageCount) {
        this(title,pageCount);
        this.pageCount = pageCount;
        System.out.println("3 arg constructor");
    }
    // copy constructor
    public Book(Book book) {
        this.title = "new->" +   book.title;
        this.pageCount = 1000 + book.pageCount;
    }
    public void displayBook() {
        System.out.printf("Book name:  %s %n Book page count: %d%n", title, pageCount);
    }
}
