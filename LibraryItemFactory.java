public class LibraryItemFactory {
    
    public static LibraryItem createLibraryItem(ItemType type) {
        switch(type) {
            case GENERAL_BOOK:
                GeneralBook b = new GeneralBook(); return b;
            case REFERENCE_BOOK:
                ReferenceBook r = new ReferenceBook(); return r;
            case MAGAZINE:
                Magazine m = new Magazine(); return m;
            case NEWSPAPER:
                NewsPaper n = new NewsPaper(); return n;
            default:
                return null;
        }
    }
}