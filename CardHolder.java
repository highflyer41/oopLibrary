public class CardHolder {
    
    private String name, age;
    private boolean checkout, reserve;

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

}