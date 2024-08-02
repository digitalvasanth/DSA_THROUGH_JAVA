public class SieveOfEratosthenes
{
    public static void main(String [] args)
    {
        int n=10;
        //print primes less than n

        checkPrime(n);
    }
    public static void checkPrime(int n)
    {
        int prime[]=new int[n];
        for(int i=2;i<n;i++)
        prime[i]=1;


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