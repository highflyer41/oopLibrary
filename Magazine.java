public class Magazine extends Periodical{

    private boolean images;
    
    public Magazine(String title, String author, String releaseSchedule,boolean images, int copies) {
        super(title, author, releaseSchedule, copies);
        this.images = images;
    }

    public boolean hasImages() {
        return this.images;
    }

    public void setImages(boolean images) {
        this.images = images;
    }

}