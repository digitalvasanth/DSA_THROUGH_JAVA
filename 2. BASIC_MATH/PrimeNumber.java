/*
Input:N = 2
Output:True
Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
 */

public class PrimeNumber {
    

    public static void main(String [] args)
    {
        int n=12;

        System.out.println(check(n));
    }
    public static boolean check(int n)
    {
        int c=0;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            c+=2;

            if(i*i==n)
            c-=1;
        }
        if(c==2)
        return true;
        else
        return false;
    }
}
