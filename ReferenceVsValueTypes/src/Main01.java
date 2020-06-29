import java.util.Arrays;

public class Main01 {
    public static void main(String[] args) {

        // Value Types point to a new object in memory
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("\nmyIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("\nAfter Change:");
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        // Reference Types (Same Address) point to the same object in memory, unless a new object is created.
        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        System.out.println("\nmyIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 15;

        System.out.println("\nAfterChange:");
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));

        // Reference Type pointing to a new object in memory
        anotherIntArray = new int[] {4,5,6,7,8};

        modifyArray(myIntArray);

        System.out.println("\nAfterChange with methods:");
        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherIntArray = " + Arrays.toString(anotherIntArray));
    }

    // Reference Types using methods
    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1,2,3,4,5};
    }
}
