public class LibraryItemFactory {
    
    public static LibraryItem createLibraryItem(ItemType type) {
        switch(type) {
            case GENERAL_BOOK:
                return new GeneralBook();
            case REFERENCE_BOOK:
                return new ReferenceBook();
            case MAGAZINE:
                return new Magazine();
            case NEWSPAPER:
                return new NewsPaper();
            default:
                return null;
        }
    }
}