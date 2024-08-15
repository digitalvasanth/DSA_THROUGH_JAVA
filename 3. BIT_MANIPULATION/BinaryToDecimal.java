/*
 Input : 1100
Output : 12
Input : 1111
Output : 15
 */


import java.util.*;
public class BinaryToDecimal {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter Binary number");
        String str=sc.nextLine();

        
        System.out.println(Long.parseLong(str,2));


        
    }

}
