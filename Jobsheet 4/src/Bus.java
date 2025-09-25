public class Bus {
    private TravelOperator operatorName;
    private String brand;
    private String plateNumber;
     private String engineType;
    private int capacity;
    private Passenger[] passengers;
    private int passengerCount;

    public Bus(TravelOperator operatorName, String brand, String plateNumber, String engineType, int capacity) {
        this.operatorName = operatorName;
        this.brand = brand;
        this.plateNumber = plateNumber;
        this.engineType = engineType;
        this.capacity = capacity;
        this.passengers = new Passenger[capacity];
        this.passengerCount = 0;
    }

    public void addPassenger(Passenger p) {
        if (passengerCount < capacity) {
            passengers[passengerCount] = p;
            passengerCount++;
        } else {
            System.out.println("Bus is full! Cannot add passenger " + p.getName());
        }
    }

    public void removePassenger(int index) {
        if (index >= 0 && index < passengerCount) {
            for (int i = index; i < passengerCount - 1; i++) {
                passengers[i] = passengers[i + 1];
            }
            passengers[passengerCount - 1] = null;
            passengerCount--;
        } else {
            System.out.println("Invalid passenger index!");
        }
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setTravelOperator(TravelOperator operatorName) {
        this.operatorName = operatorName;
    }

    public TravelOperator getTravelOperator() {
        return operatorName;
    }

     public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void displayInfo() {
        System.out.println("Bus Plate Number: " + plateNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Engine Type: " + engineType);

        if (operatorName != null) {
            operatorName.displayInfo();
        }

        System.out.println("Capacity: " + capacity);
        System.out.println("Current Passenger Count: " + passengerCount);
        System.out.println("Passenger List:");
        for (int i = 0; i < passengerCount; i++) {
            passengers[i].displayInfo();
        }
    }
}
