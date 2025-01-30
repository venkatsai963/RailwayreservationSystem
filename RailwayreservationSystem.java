import java.util.Scanner;

public class RailwayreservationSystem {

    static int availableSeats = 10;  
    public static void bookTicket(int tickets) {
        if (tickets <= availableSeats) {
            availableSeats -= tickets;
            System.out.println("Successfully booked " + tickets + " tickets.");
            System.out.println("Remaining available seats: " + availableSeats);
        } else {
            System.out.println("Sorry, not enough seats available.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Railway Reservation System");
            System.out.println("1. Book Tickets");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the number of tickets you want to book: ");
                    int tickets = scanner.nextInt();
                    bookTicket(tickets);
                    break;
                case 2:
                    System.out.println("Available seats: " + availableSeats);
                    break;
                case 3:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}