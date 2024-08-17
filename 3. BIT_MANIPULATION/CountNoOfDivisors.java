/*
 Input : 18
Output : 6
Divisors of 18 are 1, 2, 3, 6, 9 and 18.

Input : 100
Output : 9
Divisors of 100 are 1, 2, 4, 5, 10, 20,25, 50 and 100
 */
public class CountNoOfDivisors {
    
    public static void main(String [] args)
    {
        int n=10;
        System.out.println(count(n));
    }


    public static int count(int n)
    {
        int c=0;
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                c+=2;
            if(i*i==n)
                c-=1;
        }
        return c;
    }
}
