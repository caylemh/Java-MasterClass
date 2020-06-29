
public class Main {
    public static void main(String[] args) {
        // Building a PC
        Case theCase = new Case("2020B", "DELL", "240", new Dimensions(20,20,5));

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6, "v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);
        thePC.powerUp();
        thePC.getMotherboard().loadProgram("Windows 95");

        System.out.println("\nThe PC has a " + theCase.getManufacturer() + " case, a " +
                theMonitor.getManufacturer() + " monitor,  and a " +
                theMotherboard.getManufacturer() + " motherboard. Wow!");

        //Building a Room
//        Wall wall1 = new Wall("North");
//        Wall wall2 = new Wall("South");
//        Wall wall3 = new Wall("East");
//        Wall wall4 = new Wall("West");
//
//        Ceiling ceiling = new Ceiling(3, "Pink");
//        Bed bed = new Bed("Queen");
//        Lamp lamp = new Lamp("Modern", true);
//
//        Room bedRoom = new Room("Caylem's Bedroom",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
//        bedRoom.makeBed();
//        bedRoom.getLamp().turnOn();

    }
}
