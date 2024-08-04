/*
Input:N = 12345
Output:54321
Explanation: The reverse of 12345 is 54321.
*/
public class ReverseNumber {
    public static void main(String [] args)
    {
        int n=1435;


        int rev=0;
        while(n!=0)
        {
            int ld=n%10;
            rev=rev*10+ld;
            n=n/10;
        }
        System.out.println("reverse is "+rev);
    }
}
