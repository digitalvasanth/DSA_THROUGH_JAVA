import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    // Read the integer value from input
    private static int getA() {
        return scanner.nextInt();
    }

    // Read the binary string from input and convert it to a list of characters
    private static ArrayList<Character> getB(int size) {
        String input = scanner.next(); // Read the binary string
        ArrayList<Character> list = new ArrayList<>(size);
        for (int i = 0; i < size; ++i) {
            list.add(input.charAt(i)); // Add each character to the list
        }
        return list;
    }

    // Display "NO"
    private static void displayC() {
        System.out.println("NO");
    }

    // Display "YES"
    private static void displayD() {
        System.out.println("YES");
    }

    // Process each test case
    private static void processE() {
        int f = getA(); // Read the size of the binary strings
        ArrayList<Character> g = getB(f); // Read the first binary string
        ArrayList<Character> h = getB(f); // Read the second binary string
        for (int i = 0; i < f; i++) {
            if (g.get(i) == '0' && h.get(i) == '1') {
                displayC(); // Print "NO" if a '0' in the first string matches with '1' in the second string
                return;
            }
        }
        displayD(); // Print "YES" if no such pair is found
    }

    // Start the process for multiple test cases
    private static void startF() {
        int j = getA(); // Read the number of test cases
        while (j-- > 0) {
            processE();
        }
    }

    // Main function
    public static void main(String[] args) {
        startF(); // Start processing the test cases
        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
