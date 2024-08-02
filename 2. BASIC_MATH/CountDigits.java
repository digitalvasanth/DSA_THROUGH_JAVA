

public class CountDigits {
    
    public static void main(String [] args)
    {
        int n=1555;


        // int digitCount=(int)Math.log10(n)+1;
        int digitCount=String.valueOf(n).length();
        System.out.println(digitCount);

        
    }
}
