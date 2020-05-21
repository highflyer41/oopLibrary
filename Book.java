public class Book extends LibraryItem {

    private int pages;

    public Book(String title, Author author, int pages, int copies) {
        super(title, author, copies);
        this.pages = pages;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}