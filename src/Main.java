import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("**************Welcome to SM Movies**************");
            System.out.println("(1) Movies Streaming Today \n(2) Book Tickets " +
                    "\n(3) Available Tickets \n(4) Cancel Tickets " +
                    "\n(5) Booked Tickets \n(6) Exit");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();

            switch (choose) {

                case 1 : {
                    System.out.println("Screen 1 : Mankatha \nScreen 2 : Ghilli");
                    break;
                }

                case 2 : {
                    System.out.println("Which one? [1] Mankatha [2] Ghilli");
                    int movieNo = sc.nextInt();

                    if (movieNo==1) {
                        System.out.println("Price per person Rs.100 \nHow many tickets do you want to book");
                        int count = sc.nextInt();
                        sc.nextLine();

                        if (Booking.screen1seatNo <= Booking.screen1Limit) {
                            for (int i = 1; i <= count; i++) {
                                System.out.println("Enter " + i + "th name:");
                                String name = sc.next();
                                Booking.Screen1Booking(name);
                            }
                        } else {
                            System.out.println("No Tickets available");
                            break;
                        }
                        break;
                    }
                    else if (movieNo==2) {
                        System.out.println("Price per person Rs.100 \nHow many tickets do you want to book");
                        int count = sc.nextInt();
                        sc.nextLine();

                        if (Booking.screen2seatNo <= Booking.screen2Limit) {
                            for (int i = 1; i <= count; i++) {
                                System.out.println("Enter " + i + "th name:");
                                String name = sc.next();
                                Booking.Screen2Booking(name);
                            }
                        } else {
                            System.out.println("No Tickets available");
                            break;
                        }
                        break;
                    }
                    else {
                        System.out.println("Enter valid number");
                        break;
                    }
                }

                case 3 : {
                    System.out.println("Processing..");
                    Booking.printAvailable();
                    break;
                }

                case 4 : {
                    System.out.println("[1] for screen 1 cancelling \n[2] for screen 2 cacelling");
                    int choice = sc.nextInt();
                    System.out.println("Enter seat No. to cancel");
                    int seatno = sc.nextInt();

                    if (choice == 1) {
                        Booking.screen1Cancelling(seatno);
                        break;
                    }
                    else if (choice == 2) {
                        Booking.screen2Cancelling(seatno);
                        break;
                    }
                    else {
                        break;
                    }
                }

                case 5 : {
                    Booking.display();
                    break;
                }

                case 6 : {
                    System.out.println("Thank you for using our application");
                    break;
                }
            }
        }
    }
}