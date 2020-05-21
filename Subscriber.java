public class Subscriber {
    
    public Subscriber(LibraryItem...items) {
        for (LibraryItem ele: items) {
            Server.getInstance().addSubscriber(this, ele);
        }
    }

    public void receivedMessage(LibraryItem item, String m) {
        switch(item.getTitle()) {
            case "Successful Test": System.out.println(m); break;
        }
    }
}