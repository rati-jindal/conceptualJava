package Basics;

public class Ticket {
    int ticketNumber;
    static int totalTicketsSold;

    Ticket() {
        totalTicketsSold++;
        this.ticketNumber = totalTicketsSold;
//        ticketNumber++;

    }

    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket();

        System.out.println("T1: " + t1.ticketNumber);
        System.out.println("T2: " + t2.ticketNumber);
        System.out.println("T3: " + t3.ticketNumber);
        System.out.println(totalTicketsSold);
    }
}
