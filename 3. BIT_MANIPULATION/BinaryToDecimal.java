/*
 Input : 1100
Output : 12
Input : 1111
Output : 15
 */
public class BinaryToDecimal {
    public static void main(String [] args)
    {
        int n=101;
        String str=String.valueOf(n);
        System.out.println(Integer.parseInt(str,2));
    }

}
