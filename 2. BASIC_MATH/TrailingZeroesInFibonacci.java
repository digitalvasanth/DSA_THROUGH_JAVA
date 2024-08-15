/*
Input: n = 5
Output: 1
Explanation: Factorial of 5 is 120 which has one trailing 0.vi
*/
public class TrailingZeroesInFibonacci {
    public static void main(String [] args)
    {
        int n=5;
        int sum=0;

        while(n>0)
        {
            n=n/5;
            sum=sum+n;
        }
        System.out.println(sum);
    }
}
