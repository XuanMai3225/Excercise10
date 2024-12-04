package Excercise8;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do{
            System.out.println("========== BOOK MANAGEMENT ==========");
            System.out.println("1. Add New TextBook"); 
            System.out.println("2. Add New Reference Book");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Find Book");
            System.out.println("6. Display All Book");
            System.out.println("7. Find Most Expensive Book");
            System.out.println("8. Count total number of TextBook and ReferenceBook");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); //Bỏ ký tự xuống dòng còn lại
            
            String id, title;
            double basePrice;
            switch(choice){
                case 1:
                    System.out.println("==== Add new TextBook ====");
                    System.out.print("Enter ID: ");
                    id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter Base Price: ");
                    basePrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Subject: ");
                    String subject = scanner.nextLine();
                    TextBook textbook = new TextBook(id, title, basePrice, subject);  //Tạo đối tg TextBook
                    bookList.addTextBook(textbook);   //Thêm vào danh sách
                    System.out.println("Textbooks added successfully");
                    break;
                
                case 2:
                    System.out.println("==== Add New ReferenceBook ====");
                    System.out.print("Enter ID: ");
                    id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter Base Price: ");
                    basePrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Enter Publisher: ");
                    String publisher = scanner.nextLine();
                    ReferenceBook referencebook = new ReferenceBook(id, title, basePrice, publisher);
                    bookList.addReferenceBook(referencebook);
                    System.out.println("ReferenceBook added successfully");
                    break;
                    
                case 3:
                    System.out.println("==== Update Book ====");
                    System.out.print("Enter ID: ");
                    id = scanner.nextLine();
                    System.out.print("Enter Title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter Base Price: ");
                    basePrice = scanner.nextDouble();
                    scanner.nextLine();
                    if(bookList.updateBookById(id, title, basePrice)){  //Gọi PT từ bookList                       
                        System.out.println("Update Successfull");
                    }else{
                        System.out.println("Update Not Successfull");
                    }
                    break;
                    
                case 4:
                    System.out.println("==== Delete Book ====");
                    System.out.print("Enter ID: ");
                    id = scanner.nextLine();
                    if(bookList.deleteBookById(id)){
                        System.out.println("Delete Book Successfull");
                    }else{
                        System.out.println("Delete Book Not Successfull ");
                    }
                    break;
                    
                case 5:
                    System.out.println("==== Find Book ====");
                    System.out.print("Enter ID: ");
                    id = scanner.nextLine();
                    Book book = bookList.FindBookById(id);
                    if(book != null){
                        book.displayDetails();
                    }else{
                        System.out.println("Find Book Not Successful");
                    }
                    break;
                    
                case 6: 
                    System.out.println("==== Display All Book ====");
                    bookList.displayAllBooks();
                    break;
                    
                case 7:
                    System.out.println("==== Find Most Expensive Book ====");
                    Book expensiveBook = bookList.findMostExpensiveBook();
                    if(expensiveBook != null){
                        System.out.println("Book Expensive");
                        expensiveBook.displayDetails();
                    }else{
                        System.out.println("Find Book not Successful");
                    }
                    break;
                    
                case 8:
                    System.out.println("==== Count total number of TextBook and ReferenceBook ====");
                    int TextBook = 0;
                    int ReferenceBook = 0;
                    for(Book b : bookList.getBookList()){  //Lặp qa DS
                        if(b instanceof TextBook){  //Ktra kiểu sách = instanceof
                        TextBook++;
                        }else if(b instanceof ReferenceBook){
                            ReferenceBook++;
                        }
                    }
                    System.out.println("Total TextBook: " +bookList.TextBook());
                    System.out.println("Total ReferenceBook: " +bookList.ReferenceBook());
                    break;
                    
                case 0:
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("Invalid choice");
            }            
        }while(choice != 0);
        scanner.close();
    }
}
