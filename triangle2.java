 public class Main {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // 1. Prints spaces to center the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // 2. Prints the stars with an extra space after each star
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // 3. Moves to the next line
            System.out.println();
        }
    }
}