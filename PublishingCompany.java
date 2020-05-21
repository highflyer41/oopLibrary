public class PublishingCompany {
    
    private String companyName;
    private int numberOfClients;

    public PublishingCompany(String companyName, int numberOfClients) {
        this.companyName = companyName;
        this.numberOfClients = numberOfClients;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }
    
}