public class SumThreeFive {
    public static void main(String[] args) {
        int count = 0, sum = 0;

        for(int i=1; i<1001; i++) {
            if ((i%3 == 0) && (i%5 == 0)) {
                System.out.println("Number " + i + " is divisible by both 3 and 5.");
                count++;
                sum += i;
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("The sum of the 5 divisible numbers = " + sum);
    }
}
