package Excercise8;

public class ReferenceBook extends Book{
    private String publisher;
    
    public ReferenceBook(String id, String title, double basePrice, String publisher){
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    @Override
    public double calculatePrice(){
        return getBasePrice() * 1.2; //Tăng 20%
    }
    
    @Override
    public void displayDetails(){
        System.out.println("ID: " +getId());
        System.out.println("Title: " +getTitle());
        System.out.println("Base Price: " +getBasePrice());
        System.out.println("Publisher: " +publisher);
    }
}
