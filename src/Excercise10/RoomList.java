package Excercise10;

import java.util.ArrayList;

public class RoomList {

    private ArrayList<Room> roomList;

    public RoomList() {
        this.roomList = new ArrayList<>();
    }

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public void updateRoomById(String id) {
        for (Room room : roomList) {
            if (room instanceof Room && ((Room) room).getId().equals(id)) {
                room.updateRoomById(id);
                return;
            }
        }
    }

    public void deleteRoomById(String id) {
        roomList.removeIf(room -> room instanceof Room && ((Room) room).getId().equals(id));
    }

    public void findRoomById(String id) {
        for (Room room : roomList) {
            if (room instanceof Room && ((Room) room).getId().equals(id));
            return;
        }
    }

    public void displayAllRooms() {
        for (Room room : roomList) {
            room.displayDetails();
            return;
        }
    }

    public Room findMostExpensiveRoom() {
        if (roomList.isEmpty()) {
            return null;
        }
        Room mostExpensive = roomList.get(0);
        for (Room room : roomList) {
            if (room.calculateCost() > mostExpensive.calculateDayStays()) {
                mostExpensive = room;
            }
        }
        return mostExpensive;
    }

    public void countRoom() {
        int meetingRoom = 0;
        int bedRoom = 0;
        for (Room room : roomList) {
            if (room instanceof MeetingRoom) {
                meetingRoom++;
            } else if (room instanceof BedRoom) {
                bedRoom++;
            }
        }
        System.out.println("Meeting Room: " + meetingRoom);
        System.out.println("Bed Room: " + bedRoom);
    }
}
