public class Lamp {
    private String type;
    private boolean batteries;

    public Lamp(String type, boolean batteries) {
        this.type = type;
        this.batteries = batteries;
    }

    public void turnOn() {
        System.out.println("Lamp -> Turning on!");
    }

    public String getType() {
        return type;
    }

    public boolean isBatteries() {
        return batteries;
    }
}
