/*
 Input: n = 5, k = 1
Output:Not Set
Explanation: 5 is represented as 101 in binary and bit at position 1 is not set

Input: n = 5, k = 2
Output:Set
Explanation: 2 is represented as 10 in binary, all higher i.e. beyond MSB, bits are NOT SET.
 */

import java.util.*;
public class CheckithBitisSet {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
            long n=5;
            long i=2;

        if(( (n)&(1<<i))!=0)
        System.out.println("Set");
        else
        System.out.println("Not Set");

    }
}
