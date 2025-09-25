public class Ticket {
    private String ticketNumber;
    private String destination;
    private double price;

    public Ticket(String ticketNumber, String destination, double price) {
        this.ticketNumber = ticketNumber;
        this.destination = destination;
        this.price = price;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Ticket: " + ticketNumber +
                           " | Destination: " + destination +
                           " | Price: " + price);
    }
}
