public class Vehicle {
    private String type;
    private String name;

    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String type, String name, int speed, int direction) {
        this.type = type;
        this.name = name;

        this.currentSpeed = speed;
        this.currentDirection = direction;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at: " + currentDirection + " degrees.");
    }

    public void move(int speed, int direction) {
        currentSpeed = speed;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentSpeed " in direction " + currentDirection);
    }

    public String getType() {
        return type;
    }


    public String getName() {
        return name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentSpeed = 0;
    }
}
