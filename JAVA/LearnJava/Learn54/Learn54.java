package NewLearn.Learn54;

import java.util.Scanner;

public class Learn54 {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner s = new Scanner(System.in);
        while (true){
            int no = s.nextInt();
            switch (no){
                case 1 -> hotel.display();
                case 2 -> hotel.order(s.nextInt());
                case 3 -> hotel.exit(s.nextInt());
            }
        }
    }
}
