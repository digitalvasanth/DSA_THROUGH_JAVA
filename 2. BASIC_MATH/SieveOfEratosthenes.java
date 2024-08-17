
import java.util.Arrays;

// print primes till n
public class SieveOfEratosthenes
{
    public static void main(String [] args)
    {
        int n=50;
        //print primes less than n
        checkPrime(n);
    }
    public static void checkPrime(int n)
    {
        int prime[]=new int[n];
        Arrays.fill(prime,1);
        prime[0]=0;
        prime[1]=0;

        for(int i=2;i*i<=n;i++)
        {
            if(prime[i]==1)
            {
                for(int j=i*i;j<n;j=j+i)
                    prime[j]=0;
            }

        }
        for(int i=2;i<prime.length;i++){
        if(prime[i]==1)
        System.out.println(i+" ");
        }

    }
}