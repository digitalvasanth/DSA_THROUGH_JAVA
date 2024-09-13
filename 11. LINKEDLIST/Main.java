import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // Number of test cases
        
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int sum = a + 2 * b;

            if (sum % 2 != 0) {
                System.out.println("NO");
            } else {
                if ((b % 2 == 0) || (a >= 2 && a % 2 == 0)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        
        scanner.close();
    }
}

