/*
 Input: n = 5, k = 1
Output:Not Set
Explanation: 5 is represented as 101 in binary and bit at position 1 is not set

Input: n = 5, k = 2
Output:Set
Explanation: 2 is represented as 10 in binary, all higher i.e. beyond MSB, bits are NOT SET.
 */
public class CheckithBitisSet {
    public static void main(String [] args)
    {
       
            int  n=5;
            int  i=1;

        if(((n>>i)&1)!=0)
            System.out.println("Set");
        else
            System.out.println("Not Set");

    }
}
