public class LibraryDriver {
    
    public static void main(String[] args) {
        GeneralBook gBook = new GeneralBook("Twilight", "Some Chick", "Thriller", 2000, 5);

        System.out.println(gBook.getAuthor());
    }
}