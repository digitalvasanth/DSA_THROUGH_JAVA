/*
  For Example:
In Octal: 167
In Decimal:(7 * 80) + (6 * 81) +(1 * 82)=119
 */
public class OctalToDecimal {
    
    public static void main(String [] args)
    {
        int n=167;
        int base=8;
        int dec=0;
        int i=0;
        while(n!=0)
        {
            int l=(int)n%10;
            dec+=l*(int)Math.pow(base,i);
            n=n/10;
            i++;
        }
        System.out.println(dec);
    }
}
