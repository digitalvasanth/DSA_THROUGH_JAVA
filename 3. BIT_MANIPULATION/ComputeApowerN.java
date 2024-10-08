/*
 Input : x = 2, n = 3
Output : 8

Input : x = 7, n = 2
Output : 49
 */
public class ComputeApowerN {
    public static void main(String [] args)
    {
        int a=2;
        int n=4;
        System.out.println(compute(a,n));
    }

    public static int compute(int a, int n)
    {
        if(n==0)
            return 1;


        int p=compute(a,n/2);
        if(n%2==0)
            return p*p;
        else
            return a*p*p;
        }
}
