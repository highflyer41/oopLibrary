public class GeneralBook extends Book{

    private String genre;
    
    public GeneralBook(String title, String author, String genre, int pages, int copies) {
        super(title, author, pages, copies);
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}