public class Main {
    public static void main(String[] args) {
        int test = SumOddRange.sumOdd(10, 10);
        System.out.println("The sum of all the odd numbers = " + test);

        test = SumOddRange.sumOdd(10, 5);
        System.out.println("The sum of all the odd numbers = " + test);

        test = SumOddRange.sumOdd(0, 0);
        System.out.println("The sum of all the odd numbers = " + test);

        test= SumOddRange.sumOdd(10,30);
        System.out.println("The sum of all the odd numbers = " + test);
    }
}
