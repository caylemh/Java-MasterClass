class Car {
    private String name;
    private boolean isEngine;
    private int cylinders;
    private int wheels;
    private int doors;

    public Car(String name, int cylinders, int doors) {
        this.name = name;
        this.isEngine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = doors;
    }

    public String getName() {
        return name;
    }


    public String startEngine() {
        return ("A Car has been started!");
    }

    public void accelerate(int acceleratePercentage) {
        if(acceleratePercentage > 0 && acceleratePercentage <= 100) {
            acceleratePercentage += 10;
            System.out.println("The " + getClass().getSimpleName() + " " +
                    this.name + " is accelerating at a rate of: " + acceleratePercentage + "%");
        }
    }

    public void brake(int brakePercentage) {
        if(brakePercentage > 0 && brakePercentage < 100) {
            brakePercentage += 10;
            System.out.println("The " + getClass().getSimpleName() + " " +
                    this.name + " is stopping at a rate of: " + brakePercentage + "%\n");
        } else {
            System.out.println("The " + getClass().getSimpleName() + " " +
                    this.name + " has stopped!\n");
        }
    }
}

class Jaguar extends Car {

    public Jaguar() { super("XKR", 6,2); }

    @Override
    public String startEngine() {
        return "The Jaguar has been started!";
    }
}

class Nissan extends Car {

    public Nissan() { super("Skyline GTR R36", 6,2); }

    @Override
    public String startEngine() {
        return "The Nissan has been started!";
    }
}

class Mazda extends Car {

    public Mazda() { super("MX5", 6,2); }

}

class Koenigsegg extends Car {

    public Koenigsegg() { super("JESKO Race 1", 8,2); }

    @Override
    public String startEngine() {
        return "The Koenigsegg has been started!";
    }
}

class Ferrari extends Car {

    public Ferrari() { super("FXX F1", 12,2); }

    @Override
    public String startEngine() {
        return "The Ferrari has been started!";
    }
}

public class PolymorphChallenge {
    public static void main(String[] args) {
        for(int i=1; i<6; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + " : " + car.getName());
            System.out.println("Starting Engine: " + car.startEngine());
            car.accelerate(i * 10);
            car.brake((i+2) * 10);
        }
    }

    public static Car randomCar() {
        int randomNumber = (int)(Math.random() * 5) +1;
        System.out.println("Random Number Generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaguar();
            case 2:
                return new Mazda();
            case 3:
                return new Koenigsegg();
            case 4:
                return new Ferrari();
            case 5:
                return new Nissan();
        }

        return null;
    }
}
