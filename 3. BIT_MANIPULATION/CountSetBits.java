
import java.util.Scanner;

public class CountSetBits{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);


        long n=sc.nextLong();

        int c=0;
        while(n!=0)
        {
            n=n&(n-1);
            c++;
        }

        System.out.println("Set bits : "+c);
    }
}