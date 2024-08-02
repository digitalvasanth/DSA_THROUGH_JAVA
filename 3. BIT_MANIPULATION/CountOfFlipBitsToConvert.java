public class CountOfFlipBitsToConvert {
    
    public static void main(String [] args)
    {
        int a=10;
        int b=7;

        //to convert a to b
        int count=0;
        int ans=a^b;
        while(ans!=0)
        {
            if((1&ans)!=0)
            count++;

            ans=ans>>1;
        }
        System.out.println(count+" Bits to be Moved .");
    }
}
