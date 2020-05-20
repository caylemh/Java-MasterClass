public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (((hourOfDay < 8) && !(hourOfDay < 0)) || ((hourOfDay > 22) && !(hourOfDay > 23))) {
                System.out.println("Wake up! The dog is barking!");
                return true;
            } else {
                System.out.println("The dog is barking... But it's ok.");
                return false;
            }
        }
        System.out.println("The dog is quiet...Zzzz.");
        return false;
    }
}
