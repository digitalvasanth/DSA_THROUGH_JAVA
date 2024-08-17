/*
 Input : n = 6
Output : 2
Binary representation of 6 is 110 and has 2 set bits

Input : n = 13
Output : 3
Binary representation of 13 is 1101 and has 3 set bits
 */

public class CountSetBits{
    public static void main(String [] args)
    {
       int n=10;

        int c=0;
       while(n!=0)
       {
            if((n&1)!=0)
                c++;

            n=n>>1;
       }

        System.out.println("Set bits : "+c);
    }
}