public class NumberAppearsOddTimes {
    
    public static void main(String [] args)
    {
        int arr[]={1,1,2,2,4,5,4,6,6,10};

        int xorr=0;
        for(int i:arr)
        xorr^=i;


        int rightmost= (xorr&-xorr);

        int b1=0;
        int b2=0;
        for(int i:arr)
        {
            if((i&rightmost)!=0)
                b1=b1^i;
            else
                b2=b2^i;
        }

        System.out.println(b1+" "+b2);
    }
}
