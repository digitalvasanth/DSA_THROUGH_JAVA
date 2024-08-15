/*
 Input : n = 4
Output : Yes 2^2 = 4

Input : n = 7
Output : No
 */
import java.util.*;
public class PowerOf2OrNot {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        if((n&(n-1))==0)
        System.out.println("Power of 2");
        else
        System.out.println("Not a Power of 2");
    }
}
