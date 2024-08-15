/*
 Input : 11
Output : 13
Explanation: (11)10 = (1011)2.
After reversing the bits we get: (1101)2 = (13)10.
 */

public class ReverseBits {
    
    public static void main(String [] args)
    {
        int n=15;

        long rev=0;
        for(int i=0;i<32;i++)
        {
            rev=rev<<1;
            rev|=(n&1);
            n=n>>1;

        }
        System.out.println(rev);

    }
}
