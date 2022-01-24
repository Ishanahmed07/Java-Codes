import java.util.*;

class TicketBookingThread extends Thread {

    private TicketCounter ticketCounter;
    private String passengerName;
    private int noOfSeatsToBook;

    public TicketBookingThread(TicketCounter ticketCounter, String passengerName, int noOfSeatsToBook) {
        this.ticketCounter = ticketCounter;
        this.passengerName = passengerName;
        this.noOfSeatsToBook = noOfSeatsToBook;
    }

    public void run() {
        ticketCounter.bookTicket(passengerName, noOfSeatsToBook);
    }
}

class TicketCounter {

    private int availableSeats = 3;

    public void bookTicket(String pname, int numberOfSeats) {
        if ((availableSeats >= numberOfSeats) && (numberOfSeats > 0)) {
            System.out.println("Hi," + pname + " : " + numberOfSeats + " Seats booked Successfully..");
            System.out.println();
            availableSeats = availableSeats - numberOfSeats;
        } else
            System.out.println("Hi," + pname + " : Seats Not Available");
    }
}

public class Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String n1 = sc.next();
        System.out.println("Enter number of seats : ");
        int seat = sc.nextInt();
        System.out.print("Enter your name : ");
        String n2 = sc.next();
        TicketCounter ticketCounter = new TicketCounter();
        TicketBookingThread t1 = new TicketBookingThread(ticketCounter, n1, seat);
        TicketBookingThread t2 = new TicketBookingThread(ticketCounter, n2, 2);

        t1.start();
        t2.start();
        sc.close();
    }
}