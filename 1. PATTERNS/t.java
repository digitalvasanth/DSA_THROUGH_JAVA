import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            // Fill b with numbers from 1 to n*m
            int[][] b = new int[n][m];
            int num = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    b[i][j] = num++;
                }
            }

            // Check if we can shift the numbers in b to make sure b[i][j] != a[i][j]
            boolean isPossible = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (a[i][j] == b[i][j]) {
                        isPossible = false;
                        break;
                    }
                }
                if (!isPossible) break;
            }

            if (isPossible) {
                // If possible, print the matrix b
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print(b[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                // If not possible, shift the last row to the top and check again
                for (int j = 0; j < m; j++) {
                    int temp = b[0][j];
                    for (int i = 0; i < n - 1; i++) {
                        b[i][j] = b[i + 1][j];
                    }
                    b[n - 1][j] = temp;
                }

                isPossible = true;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (a[i][j] == b[i][j]) {
                            isPossible = false;
                            break;
                        }
                    }
                    if (!isPossible) break;
                }

                if (isPossible) {
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(b[i][j] + " ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println(-1);
                }
            }
        }

        sc.close();
    }
}
