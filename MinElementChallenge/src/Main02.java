import java.util.Arrays;
import java.util.Scanner;

public class Main02 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of integers to count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] myArray = readIntegers(count);

        System.out.println("\nmyArray contains: " + Arrays.toString(myArray));

        System.out.println("\nThe smallest value in myArray is: " + findMin(myArray));
    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " Integer values.\r");
        int[] values = new int[count];
        for(int i=0; i<values.length; i++) {
            System.out.print("Enter Element " + i + ": ");
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int findMin(int[] array) {
        int min=0;
        for(int i=0; i<array.length; i++) {
//            for(int j=1; j<array.length; j++) {
//                if(array[i] < array[j]) {
//                    min = array[i];
//                }
//            }
            int value = array[i];
            if(value < min) {
                min = value;
            }
        }
        return min;
    }
}
