public class camera {
    private int zoom;
    private String photoMode;

    public void setZoom(int newValue) {
        zoom = newValue;
    }
    
    public void photoMode(String newValue) {
        photoMode = newValue;
    }

    public void showInfo() {
        System.out.println("Camera photo mode: " + photoMode + ". Zoom " + zoom + " times");
    }
}
