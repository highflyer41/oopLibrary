/**
 * LibraryItem
 */
public class LibraryItem {

    private Author author;
    private String title;
    private int copies;

    public LibraryItem(){
        
    }

    public LibraryItem(String title, Author author, int copies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

}