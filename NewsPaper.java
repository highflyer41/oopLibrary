public class NewsPaper extends Periodical{
    
    private boolean blackWhite;
    
    public NewsPaper(String title, String author, String releaseSchedule,boolean blackWhite, int copies) {
        super(title, author, releaseSchedule, copies);
        this.blackWhite = blackWhite;
    }

    public boolean isBlackWhite() {
        return this.blackWhite;
    }

    public void setBlackWhite(boolean blackWhite) {
        this.blackWhite = blackWhite;
    }

}