public class Car extends Vehicle {
    private int doors;
    private int wheels;
    private boolean isManual;

    private int currentGear;

    public Car(String type, String name, int speed, int direction, int doors, int wheels, boolean isManual, int currentGear) {
        super(type, name, speed, direction);
        this.doors = doors;
        this.wheels = wheels;
        this.isManual = isManual;
        this.currentGear = currentGear;
    }

    public void changeCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed,direction);
        System.out.println("Car.changeVelocity(): Velocity " + speed + ", direction " + direction);
    }



}
