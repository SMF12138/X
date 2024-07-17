package NewLearn.Learn54;

public class Room {
    private int roomNo;
    private String type;
    private boolean state;

    public Room() {
    }

    public Room(int roomNo, String type, boolean state) {
        this.roomNo = roomNo;
        this.type = type;
        this.state = state;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNo=" + roomNo +
                ", type='" + type + '\'' +
                ", state=" + state +
                '}';
    }
}
