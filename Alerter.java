public class Alerter {
    
    private LibraryItem item;
    private String message = "Item is now available";

    public Alerter(LibraryItem item) {
        this.item = item;
    }

    public void alert() {
        Server.getInstance().sendMessage(item, message);
    }

}