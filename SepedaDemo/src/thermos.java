public class thermos extends bottle {
    private String insulationType;
    private int keepTemperatureHour;

    public void setInsulationType(String newValue) {
        insulationType = newValue;
    }

    public void keepTemperature(int newValue) {
        keepTemperatureHour = newValue;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Insulation type: " + insulationType + ", keep temperature for: " + keepTemperatureHour + " hour");
    }

}
