public class bottle {
    String brand;
    int capacity;

    public void setBrand(String newValue) {
        brand = newValue;
    }

    public void setCapacity(int newValue) {
        capacity = newValue;
    }

    public void fillBottle() {
        System.out.println("Bottle is filled");
    }

    public void drink() {
        System.out.println("Drink from bottle");
    }

    public void showInfo() {
        System.out.println("Bottle brand: " + brand + ", capacity: " + capacity + "ml");
    }


}
