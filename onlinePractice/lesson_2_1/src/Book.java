public class Book {
    private String title;
    private int pageCount;
    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
