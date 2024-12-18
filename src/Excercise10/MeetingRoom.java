package Excercise10;

import java.util.Date;

public class MeetingRoom extends Room {

    private int capacity;

    public MeetingRoom(String id, String name, double baseCost, Date checkinDate, Date checkoutDate, int capacity) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public double calculateCost() {
        double cost = getBaseCost() * calculateDayStays(); // từ lp cha
        if (capacity > 50) {
            return cost *= 1.2;
        }
        return cost;
    }
//    @Override

    public void enterRoomInfo(String id) {
        System.out.println("Enter Room: " + id);
    }

    @Override
    public void updateRoomById(String id) {
        System.out.println("Update Room: " + id);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Capacity: " + capacity);
    }
}
