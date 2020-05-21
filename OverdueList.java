import java.util.Collection;

public class OverdueList <T> {

    private Collection<T> overdueList;

    public OverdueList(Collection<T> overdueList) {
        this.overdueList = overdueList;
    }

    public Collection<T> getOverdueList() {
        return overdueList;
    }

    public void setOverdueList(Collection<T> overdueList) {
        this.overdueList = overdueList;
    }

}