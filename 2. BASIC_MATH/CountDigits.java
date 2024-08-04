/*
 input: N = 1567
Output: 4
Explanation: There are 4 digits in 1567, which are 1, 5, 6 and 7.
 */

public class CountDigits {
    
    public static void main(String [] args)
    {
        int n=1555;


        // int digitCount=(int)Math.log10(n)+1;
        int digitCount=String.valueOf(n).length();
        System.out.println(digitCount);

        
    }
}
