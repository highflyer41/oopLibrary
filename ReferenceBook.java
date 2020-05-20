public class ReferenceBook extends Book{
    
    private String subject;

    public ReferenceBook(String title, String author, String subject, int pages, int copies) {
        super(title, author, pages, copies);
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
}