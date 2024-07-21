public class TrailingZeroesInFibonacci {
    public static void main(String [] args)
    {
        int n=11;
        int sum=0;

        while(n>0)
        {
            n=n/5;
            sum=sum+n;
        }
        System.out.println(sum);
    }
}
