package NewLearn.Learn54;

public class Hotel {

    private final Room[][] rooms = new Room[6][10];

    public Hotel() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j] = new Room((i+1)*100+j+1,"µ¥ÈË¼ä",false);
            }
        }
    }
    public void order(int roomNo){
        rooms[roomNo/100-1][roomNo%100-1].setState(true);
    }
    public void exit(int roomNo){
        rooms[roomNo/100-1][roomNo%100-1].setState(false);
    }

    public void display(){
        for (Room[] room : rooms) {
            for (Room value : room) {
                System.out.println(value);
            }
        }
    }
}
