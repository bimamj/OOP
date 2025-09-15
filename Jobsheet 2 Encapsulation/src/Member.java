public class Member {
    private String name;
    private String address;
    private float saving;

    Member(String name, String address) {
        this.name = name;
        this.address = address;
        this.saving = 0;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String alamat) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public float getSaving() {
        return saving;
    }

    public void deposit(float money) {
        saving += money;
    }

    public void borrow(float money) {
        saving -= money;
    }
}