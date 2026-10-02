public class Main {
    public static void main(String[] args) {
        int rows = 5; // Change this number to make the triangle bigger or smaller

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Moves to the next line
        }
    }
}