import java.util.*;


public class DecimalToBinary
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter Decimal number");
        int n=sc.nextInt();

        // System.out.println("Binary is "+ Long.toBinaryString(n));
        int binary[]=new int[32];
        int idx=0;
        while(n!=0)
        {
            binary[idx++]=n%2;
            n=n/2;
        }

        for(int j=idx-1;j>=0;j--)
        System.out.print(binary[j]);
    }
}