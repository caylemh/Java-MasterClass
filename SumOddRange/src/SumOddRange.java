public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
       return (number%2 != 0);
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start > end) {
            return -1;
        } else if ((start < 0) || (end <= 0)) {
            return -1;
        }
        System.out.print("[ ");
        for(int i=start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.print("]" + "\n");
        return sum;
    }
}
