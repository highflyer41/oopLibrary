public class LibraryDriver {
    
    public static void main(String[] args) {
        
        LibraryItem item = LibraryItemFactory.createLibraryItem(ItemType.GENERAL_BOOK);

        item.setTitle("Successful Test");
        System.out.println(item.getTitle());

    }
    
}