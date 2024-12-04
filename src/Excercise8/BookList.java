package Excercise8;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> books;
    public BookList(){
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }
       
    public void addTextBook(TextBook textbook){
        books.add(textbook);       
    }
    
    public void addReferenceBook(ReferenceBook referencebook){
        books.add(referencebook);
    }
    
    public boolean updateBookById(String id, String title, double basePrice){
        for(Book book : books){
            if(book.getId().equals(id)){
                book.setTitle(title);
                book.setBasePrice(basePrice);
                return true;
            }
        }
        return false;
    }
    
    public boolean deleteBookById(String id){
        return books.removeIf(book -> book.getId().equals(id));   //xóa sách có id khớp vs đầu vào
    }
    
    public Book FindBookById(String id){
        for(Book book : books){
            if(book.getId().equals(id)){  //SS id htại vs id cần tìm
                return book;
            }
        }
        return null;
    }
    
    public void displayAllBooks(){
        for(Book book : books){
            book.displayDetails();
        }
    }
    
    public Book FindMostExpensiveBook(){
        if(books.isEmpty()){    //Ktra DS trống
            return  null;
        }
        Book mostExpensive = books.get(0);   //Giả sử sách đầu tiên đắt nhất
        for(Book book : books){
            if(book.calculatePrice() > mostExpensive.calculatePrice()){   //SS các quyển còn lại vs quyển đắt nhất
                mostExpensive = book;
            }
        }
        return mostExpensive;
    }

    Book findMostExpensiveBook() {
        throw new UnsupportedOperationException("Not supported yet.");  
    }

    Iterable<Book> getBookList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Book findBookById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String TextBook() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String ReferenceBook() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
