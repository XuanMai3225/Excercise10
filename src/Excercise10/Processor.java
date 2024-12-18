package Excercise10;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        RoomList roomList = new RoomList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("===== ROOM MANAGEMENT =====");
            System.out.println("1. Add Meeting Room");
            System.out.println("2. Add");
            System.out.println("2. Update Room");
            System.out.println("3. Delete Room");
            System.out.println("4. Find Room");
            System.out.println("5. Display All Room");
            System.out.println("6. Find Most Expensive Room");
            System.out.println("7. Count Room");
            System.out.println("0. EXIT");
            System.out.print("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 1:
                    System.out.print("Enter ID, Name, Base Cost, Checkin, Checkout, Capacity: ");
                    roomList.addRoom(new MeetingRoom(scanner.next(), scanner.next(), scanner.nextDouble(),
                            new Date(), new Date(), scanner.nextInt()));
                    break;
                case 2:
                    System.out.print("Enter ID, Name, Base Cost, Checkin, Checkout, Beds: ");
                    roomList.addRoom(new BedRoom(scanner.next(), scanner.next(), scanner.nextDouble(),
                            new Date(), new Date(), scanner.nextInt()));
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    roomList.updateRoomById(scanner.next());
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    roomList.deleteRoomById(scanner.next());
                    break;
                case 5:
                    System.out.print("Enter ID to find: ");
                    roomList.findRoomById(scanner.next());
                    break;
                case 6:
                    roomList.displayAllRooms();
                    break;
                case 7:
                    IRoom expensiveRoom = roomList.findMostExpensiveRoom();
                    if (expensiveRoom != null) {
                        expensiveRoom.displayDetails();
                    } else {
                        System.out.println("No rooms available.");
                    }
                    break;
                case 8:
                    roomList.countRooms();
                    break;
                case 9:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    
}
