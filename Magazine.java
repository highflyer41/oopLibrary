public class Magazine extends Periodical implements Reservable{

    private boolean images;

    public Magazine() {}
    
    public Magazine(String title, Author author, Schedule releaseSchedule,boolean images, int copies) {
        super(title, author, releaseSchedule, copies);
        this.images = images;
    }

    public boolean hasImages() {
        return this.images;
    }

    public void setImages(boolean images) {
        this.images = images;
    }

    public boolean isReservable() {
        return true;
    }

    public double reserveTime() {
        return 5.00;
    }

}