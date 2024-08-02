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
