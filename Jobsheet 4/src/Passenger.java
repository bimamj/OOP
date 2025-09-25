public class Passenger {
    private String name;
    private String gender;
    private Ticket ticket;

    public Passenger(String name, String gender, Ticket ticket) {
        this.name = name;
        this.gender = gender;
        this.ticket = ticket;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setTicket(Ticket ticket) { 
        this.ticket = ticket; 
    }

    public Ticket getTicket() { 
        return ticket; 
    }

    public void displayInfo() {
        System.out.println("Passenger: " + name + ", Gender :" +gender);
        if (ticket != null) {
            ticket.displayInfo();
        }
    }
}
