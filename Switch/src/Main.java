public class Main {
    public static void main(String[] args) {
        // Switch statement Challenge
        char character = 'F';
        switch(character) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("The character is: " + character);
                break;
            default:
                System.out.println("Could not find character A, B, C, D, or E!");
        }

    }
}
