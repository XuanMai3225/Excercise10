package Excercise8;

public class TextBook extends Book{
    private String subject;
    
    public TextBook(String id, String title, double basePrice, String subject){
        super(id, title, basePrice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    } 

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.1;  //Tăng 10% so vs basePrice
    }
    
    @Override
    public void displayDetails(){
        System.out.println("ID: " +getId());
        System.out.println("Title: " +getTitle());
        System.out.println("Base Price: " +getBasePrice());
        System.out.println("Subject: " +subject);
    }
}
