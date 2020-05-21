public class ReferenceBook extends Book implements Loanable{
    
    private String subject;

    public ReferenceBook(String title, Author author, String subject, int pages, int copies) {
        super(title, author, pages, copies);
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isLoanable() {
        return true;
    }

    public double loanFee() {
        return 4.00;
    }

    public Schedule feeSchedule() {
        return Schedule.DAILY;
    }
    
}