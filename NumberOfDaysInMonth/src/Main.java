public class Main {
    public static void main(String[] args) {
        int test = NumberOfDaysInMonth.getDaysInMonth(1, -2021);
        System.out.println(test);
        test = NumberOfDaysInMonth.getDaysInMonth(2, 2021);
        System.out.println(test);
        test = NumberOfDaysInMonth.getDaysInMonth(2, 2020);
        System.out.println(test);
        test = NumberOfDaysInMonth.getDaysInMonth(3, 2021);
        System.out.println(test);
        test = NumberOfDaysInMonth.getDaysInMonth(11, 2021);
        System.out.println(test);
    }
}
