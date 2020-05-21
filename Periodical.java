public class Periodical extends LibraryItem{
    
    private String releaseSchedule;
    
    public Periodical(String title, Author author, String releaseSchedule, int copies) {
        super(title, author, copies);
        this.releaseSchedule = releaseSchedule;
    }

    public String getReleaseSchedule() {
        return this.releaseSchedule;
    }

    public void setReleaseSchedule(String schedule) {
        this.releaseSchedule = schedule;
    }

}