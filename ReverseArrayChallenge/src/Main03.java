import java.util.Arrays;
import java.util.Scanner;

public class Main03 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of integers to count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] myArray = readIntegers(count);

        System.out.println("\nmyArray contains: " + Arrays.toString(myArray));

        reverse(myArray);
        System.out.println("myArray reversed: " + Arrays.toString(myArray));

        reverse(myArray);
        System.out.println("myArray reversed: " + Arrays.toString(myArray));
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

    public static void reverse(int[] array) {
        int maxIndex = array.length-1;
        int halfLength = array.length/2;
        for(int i=0; i<halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
    }
}
