public class BusDemo {
    public static void main(String[] args) {
        TravelOperator malangLine = new TravelOperator("Malang Line", "Sleeper");
        Bus b1 = new Bus(malangLine, "Mercedes", "N 1010 MJ", "Diesel", 5);
        
        Ticket t1 = new Ticket("ML001", "Malang - Surabaya", 50000);
        Ticket t2 = new Ticket("ML002", "Malang - Semarang", 170000);
        Ticket t3 = new Ticket("ML003", "Malang - Jakarta", 225000);
        Ticket t4 = new Ticket("ML004", "Malang - Surabaya", 50000);
        Ticket t5 = new Ticket("ML005", "Malang - Jakarta", 225000);
        Ticket t6 = new Ticket("ML006", "Malang - Jakarta", 225000);

        Passenger p1 = new Passenger("Resty", "Female", t1);
        Passenger p2 = new Passenger("Alif", "Male", t2);
        Passenger p3 = new Passenger("Eiyu", "Male", t3);
        Passenger p4 = new Passenger("Excel", "Male", t4);
        Passenger p5 = new Passenger("Fidela", "Female", t5);
        Passenger p6 = new Passenger("Garino", "Male", t6);

        b1.addPassenger(p1);
        b1.addPassenger(p2);
        b1.addPassenger(p3);
        b1.addPassenger(p4);
        b1.addPassenger(p5);
        b1.addPassenger(p6);


        b1.displayInfo();
    }
}
