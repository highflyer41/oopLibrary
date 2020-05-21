public class GeneralBook extends Book implements Loanable{

    private String genre;
    
    public GeneralBook() {}

    public GeneralBook(String title, Author author, String genre, int pages, int copies) {
        super(title, author, pages, copies);
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public boolean isLoanable() {
        return true;
    }

    public double loanFee() {
        return 2.00;
    }

    public Schedule feeSchedule() {
        return Schedule.WEEKLY;
    }
    
}