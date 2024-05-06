import java.util.ArrayList;
import java.util.List;

public class Booking {
    private static List<Screen1> screen1Booked = new ArrayList<>();
    private static List<Screen2> screen2Booked = new ArrayList<>();
    protected static int screen1Limit = 100;
    protected static int screen2Limit = 50;
    protected static int screen1seatNo = 1;
    protected static int screen2seatNo = 1;
    protected static List<Integer> screen1cancelledSeats = new ArrayList<>();
    protected static List<Integer> screen2cancelledSeats = new ArrayList<>();

    public static void Screen1Booking(String name) {
        if (!screen1cancelledSeats.isEmpty()){
            Screen1 obj = new Screen1();
            obj.setName(name);
            obj.setSeatNo(screen1cancelledSeats.getFirst());
            screen1cancelledSeats.removeFirst();
            screen1Booked.add(obj);
            System.out.println(obj.getName() + " Seat No: " + obj.getSeatNo() +" Booked Successfully");
        }
        else {
            Screen1 obj = new Screen1();
            obj.setName(name);
            obj.setSeatNo(screen1seatNo++);
            screen1Limit--;
            screen1Booked.add(obj);
            System.out.println(obj.getName() + " Seat No: " + obj.getSeatNo() + " Booked Successfully");
        }
    }
    public static void Screen2Booking(String name) {
        if (!screen2cancelledSeats.isEmpty()){
            Screen2 obj = new Screen2();
            obj.setName(name);
            obj.setSeatNo(screen2cancelledSeats.getFirst());
            screen2cancelledSeats.removeFirst();
            screen2Booked.add(obj);
            System.out.println(obj.getName() + " Seat No: "+ obj.getSeatNo() +" Booked Successfully");
        }
        else {
            Screen2 obj = new Screen2();
            obj.setName(name);
            obj.setSeatNo(screen2seatNo++);
            screen2Limit--;
            screen2Booked.add(obj);
            System.out.println(obj.getName() + " Seat No: " + obj.getSeatNo() + " Booked Successfully");
        }
    }

    public static void screen1Cancelling(int seatNo) {
        if (screen1Booked.isEmpty() || screen1Booked.get(seatNo-1) == null ) {
            System.out.println("Not Valid!!");
        }
        else {
            System.out.println(screen1Booked.get(seatNo-1) + " Cancelled Successfully");
            screen1Booked.remove(seatNo - 1);
            screen1cancelledSeats.add(seatNo);
            screen1Limit++;
        }

    }
    public static void screen2Cancelling(int seatNo) {
        if (screen2Booked.isEmpty() || screen2Booked.get(seatNo-1) == null ) {
            System.out.println("Not Valid!!");
        }
        else {
            System.out.println(screen2Booked.get(seatNo-1) + " Cancelled Successfully");
            screen2Booked.remove(seatNo - 1);
            screen2cancelledSeats.add(seatNo);
            screen2Limit++;
        }

    }
    public static void display() {
        System.out.println("Screen 1 Booked tickets are :");
        for (Screen1 scn : screen1Booked) {
            System.out.println(scn.toString());
        }
        System.out.println("Screen 2 Booked tickets are :");
        for (Screen2 scn : screen2Booked) {
            System.out.println(scn.toString());
        }
    }

    public static void printAvailable() {
        int screen1Available = ((100-screen1seatNo)+1) + screen1cancelledSeats.size();
        int screen2Available = ((50-screen2seatNo)+1) + screen2cancelledSeats.size();

        System.out.println("Seats available in screen 1 are :" + screen1Available);
        System.out.println("Seats available in screen 2 are :" + screen2Available);
    }
}
