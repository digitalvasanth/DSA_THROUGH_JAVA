import java.util.*;


public class DecimalToBinary
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter Decimal number");
        long n=sc.nextLong();

        System.out.println("Binary is "+ Long.toBinaryString(n));
    }
}