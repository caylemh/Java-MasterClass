public class Golf extends Car {

    private int roadServiceMonths;

    public Golf(int roadServiceMonths) {
        super("Hatchback", "Golf",2, 4, 5, true);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newSpeed = getCurrentSpeed() + rate;
        if(newSpeed == 0) {
            stop();
            changeCurrentGear(1);
        } else if(newSpeed >= 0 && newSpeed <= 10) {
            changeCurrentGear(1);
        } else if(newSpeed >= 20) {
            changeCurrentGear(2);
        } else if(newSpeed >= 30) {
            changeCurrentGear(3);
        } else {
            changeCurrentGear(4);
        }

        if(newSpeed > 0) {
            changeVelocity(newSpeed, getCurrentDirection());
        }
    }

}
