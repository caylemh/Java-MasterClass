import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int[] myIntArray = new int[25];
//
//        for(int i=0; i<myIntArray.length; i++) {
//            myIntArray[i] = i*10;
//        }
//
//        printArray(myIntArray);
//
//        // Advanced for loop
////        for(int item: myIntArray){
////            System.out.println(item);
////        }
//    }
//
//    public static void printArray(int[] array) {
//        for(int i=0; i<array.length; i++) {
//            System.out.println("Element " + i +
//                    " = " + array[i]);
//        }

        int[] myIntegers = getIntegers(5);

        for (int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i + " = " + myIntegers[i]);
        }

        System.out.println("The average of the " + myIntegers.length + " numbers are: " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " Integer values.\r");
        int[] values = new int[number];
        for(int i=0; i<values.length; i++) {
            System.out.print("Enter Element " + i + ": ");
            values[i] = scanner.nextInt();
        }
        System.out.println(" ");
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;

        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        return (double) sum/ (double)array.length;
    }
}
