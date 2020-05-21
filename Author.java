public class Author {
    
    private String name;
    private PublishingCompany publisher;

    public Author(String name, PublishingCompany publisher) {
        this.name = name;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublishingCompany getPublisher() {
        return publisher;
    }

    public void setPublisher(PublishingCompany publisher) {
        this.publisher = publisher;
    }

}