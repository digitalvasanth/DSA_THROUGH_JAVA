/*
Input  : n = 10
Output : 55
 */
public class NthFibonnaci
{
    public static void main(String [] args)
    {
        int n= 10;
       System.out.println(fib(n));
    }

    public static int fib(int n)
    {
        if(n==0||n==1)
        return n;

        return fib(n-1)+fib(n-2);
    }
}
