

public class SwapBits {
    public static void main(String [] args)
    {
        int n=10;
        
        int x=swapbits(n);
        System.out.println(x);
    }
    public static int swapbits(int n)
    {
        int evenBits=(n&0xAAAAAAAA);
        int oddBits=(n&0x55555555);
        evenBits>>=1;
        oddBits<<=1;

        return evenBits|oddBits;

    }
}
