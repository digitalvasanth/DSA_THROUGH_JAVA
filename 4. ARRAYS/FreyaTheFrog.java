import java.util.Scanner;

public class FreyaTheFrog {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int t = scanner.nextInt();
        int[] results = new int[t];
        
        for (int i = 0; i < t; i++) {
            // Read x, y, and k for each test case
            long x = scanner.nextLong();
            long y = scanner.nextLong();
            long k = scanner.nextLong();
            
            // Calculate moves required in x and y directions
            long movesX = (x + k - 1) / k;  // Equivalent to ceiling(x / k)
            long movesY = (y + k - 1) / k;  // Equivalent to ceiling(y / k)
            
            // The total moves needed is determined by the maximum of moves in x and y
            long totalMoves = Math.max(movesX, movesY);
            
            // Since every pair of moves covers an x and y move, and we alternate,
            // the total number of moves is double the maximum needed (since each direction contributes in a pair)
            // For exact calculation, no need to multiply by 2.
            results[i] = totalMoves * 2 - 1;  // Adjust for the alternating pattern
        
        }
        
        // Print all results
        for (int result : results) {
            System.out.println(result);
        }
        
        scanner.close();
    }
}
