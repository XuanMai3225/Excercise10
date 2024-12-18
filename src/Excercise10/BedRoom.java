package Excercise10;

import java.util.Date;

public class BedRoom extends Room {

    private int numberOfBeds;

    public BedRoom(String id, String name, double baseCost, Date checkinDate, Date checkoutDate, int numberOfBeds) {
        super(id, name, baseCost, checkinDate, checkoutDate);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public double calculateCost() {
        double cost = getBaseCost() * calculateDayStays();
        if (numberOfBeds >= 3) {
            return cost *= 1.1;
        }
        return cost;
    }

    public void enterRoomInfo(String id) {
        System.out.println("EnterRoom: " + id);
    }

    @Override
    public void updateRoomById(String id) {
        System.out.println("Update Room: " + id);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number Of Beds: " + numberOfBeds);
    }
}
