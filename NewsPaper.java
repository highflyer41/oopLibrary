public class NewsPaper extends Periodical implements Reservable{
    
    private boolean blackWhite;
    
    public NewsPaper(String title, Author author, String releaseSchedule,boolean blackWhite, int copies) {
        super(title, author, releaseSchedule, copies);
        this.blackWhite = blackWhite;
    }

    public boolean isBlackWhite() {
        return this.blackWhite;
    }

    public void setBlackWhite(boolean blackWhite) {
        this.blackWhite = blackWhite;
    }

    public boolean isReservable() {
        return true;
    }

    public double reserveTime() {
        return 2.00;
    }

}