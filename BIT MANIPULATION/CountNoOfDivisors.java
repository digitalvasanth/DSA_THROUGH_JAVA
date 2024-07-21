import java.util.*;
public class CountNoOfDivisors {
    
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

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
