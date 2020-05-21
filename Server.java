import java.util.Hashtable;
import java.util.List;

public class Server {
    
    private Hashtable<LibraryItem, List<Subscriber>> subscribers;

    private static Server serverInstance;

    private Server() {
        this.subscribers = new Hashtable<>();
    }

    public static Server getInstance() {
        if(serverInstance == null) {
            serverInstance = new Server();
        }
        return serverInstance;
    }

    public void sendMessage(LibraryItem item, String message) {
        List<Subscriber> subs = subscribers.get(item);
        for(Subscriber ele: subs) {
            ele.receivedMessage(item, message);
        }
    }

    public void addSubscriber(Subscriber sub, LibraryItem item) {
        subscribers.get(item).add(sub);
    }

}