public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    private int maxSpeed = 100;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan + 90> maxSpeed) {
                System.out.println("Exceeding max speed. Cannot increase speed more");
            } else {
                kecepatan += 90;
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak ON");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan: " + kecepatan + "\n");
    }
}
