import java.util.List;

public class CardHolder {
    
    private String name, age;
    private boolean checkout, reserve;
    private List<Book> overdueBooks;
    private List<Periodical> overduePeriodicals;

    public CardHolder(String name, String age, boolean checkout, boolean reserve) {
        this.name = name;
        this. age = age;
        this.checkout = checkout;
        this.reserve = reserve;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isCheckout() {
        return checkout;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }

    public boolean isReserve() {
        return reserve;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

    public List<Book> getOverdueBooks() {
        return overdueBooks;
    }

    public void setOverdueBooks(List<Book> overdueBooks) {
        this.overdueBooks = overdueBooks;
    }

    public void addOverdueBooks(Book book) {
        overdueBooks.add(book);
    }

    public List<Periodical> getOverduePeriodicals() {
        return overduePeriodicals;
    }

    public void setOverduePeriodicals(List<Periodical> overduePeriodicals) {
        this.overduePeriodicals = overduePeriodicals;
    }

    public void addOverduePeriodicals(Periodical periodical) {
        overduePeriodicals.add(periodical);
    }

}