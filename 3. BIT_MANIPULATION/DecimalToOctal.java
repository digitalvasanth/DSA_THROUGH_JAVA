public class DecimalToOctal {
    
    public static void main(String [] args)
    {
        int n=11;
      
        int octal[]=new int[32];
        int idx=0;

        while(n!=0)
        {
            octal[idx++]=n%8;
            n=n/8;

        }

        for(int j=idx-1;j>=0;j--)
        System.out.print(octal[j]);
    }
}
