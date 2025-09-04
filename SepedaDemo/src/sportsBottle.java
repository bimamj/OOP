public class sportsBottle extends bottle {
    private boolean hasNozzle;
    private String capType;

    public void setCapstyle(String newValue) {
        capType = newValue;
    }

    public void hasNozzleStatus(boolean newValue) {
        hasNozzle = newValue;
    }

    public void showInfo() {
        super.showInfo();
        if (hasNozzle == true) {
            System.out.println("Sports bottle with no nozzle, cap type: " + capType);
        } else {
            System.out.println("Sports bottle with nozzle, cap type: " + capType);
        }
    }
    
}
