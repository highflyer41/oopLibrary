public class Periodical extends LibraryItem{
    
    private Schedule releaseSchedule;

    public Periodical() {}
    
    public Periodical(String title, Author author, Schedule releaseSchedule, int copies) {
        super(title, author, copies);
        this.releaseSchedule = releaseSchedule;
    }

    public Schedule getReleaseSchedule() {
        return this.releaseSchedule;
    }

    public void setReleaseSchedule(Schedule schedule) {
        this.releaseSchedule = schedule;
    }

}