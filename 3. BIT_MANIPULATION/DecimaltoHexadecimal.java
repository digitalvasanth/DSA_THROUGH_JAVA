/*
 Input : 10
Output: A

Input : 2545
Output: 9F1
 */

public class DecimaltoHexadecimal {
        public static void main(String [] args)
    {
        int dec=10;

        String hex=Integer.toHexString(dec);
       System.out.println(hex);
    }
}
