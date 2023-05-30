public class Main {
    public static void main(String[] args) {

        int n = 7;

        // Upper half of the diamond
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" "); // Print spaces
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*"); //Print asteriks
            }

            System.out.println(); // Move to next line
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" "); // Print spaces
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*"); // Print asteriks
            }

            System.out.println(); // Move to next line
        }

    }
}