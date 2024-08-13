//Count No Of Primes Within Range
//sieve of eratosthenes
import java.util.*;
public class CountPrimesInRange
{
    public static void main(String [] args)
    {
        int n=50;

        boolean arr[]=new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(arr[i]==true)
            {
                for(int k=i*i;k<=n;k=k+i)
                {
                    arr[k]=false;
                }
            }
        }
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(arr[i])
            count++;
        }


        System.out.println(count);

    }
}