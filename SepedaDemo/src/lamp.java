public class lamp {
    private int brightness;
    private String color;

    public void setBrightness(int newValue) {
        brightness = newValue;
    }

    public void setColor(String newValue) {
        color = newValue;
    }

    public void increaseBrightness(int newValue) {
        brightness += newValue;
    }

    public void decreaseBrightness(int newValue) {
        brightness -= newValue;
    }

    public void showInfo() {
        System.out.println("Lamp color: " + color + ", brightness: " + brightness);
    }
}
