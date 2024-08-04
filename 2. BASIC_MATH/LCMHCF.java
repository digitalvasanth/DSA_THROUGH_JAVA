/*
 Input -  a=10, b=35
 Output- HCF:- 5
        LCM:- 70

        LCM(A,B) = (A*B) / HCF(A,B);
        HCF AND GCD BOTH ARE SAME 
 */
public class LCMHCF {
    
    // Function to calculate the Greatest Common Divisor (GCD) or Highest Common Factor (HCF)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate the Least Common Multiple (LCM)
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int num1=10;
        int num2=35;

        // Calculate HCF and LCM
        int hcf = gcd(num1, num2);
        int lcm = lcm(num1, num2);

        // Display the results
        System.out.println("HCF :- "+hcf);
        System.out.println("LCM :- " + lcm);
        
       
    }
}
