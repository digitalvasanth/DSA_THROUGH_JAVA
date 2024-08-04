/*
Input:N = 36
Output:[1, 2, 3, 4, 6, 9, 12, 18, 36]
Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.
 */
import java.util.*;
public class PrintDivisors {
    
    public static void main(String [] args)

    {
        int n=10;
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int i=1;i<=Math.sqrt(n);i++)
        {   if(n%i==0)
            list.add(i);

            if(i!=n/i)
            list.add(n/i);
        }

        System.out.println(list);
    }
}
