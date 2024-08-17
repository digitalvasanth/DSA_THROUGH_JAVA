/*
 Input: L = 4, R = 8 
Output: 8 
4 ^ 5 ^ 6 ^ 7 ^ 8 = 8

Input: L = 3, R = 7 
Output: 3  
 */
public class FindXorWithinLandR {
    
    public static void main(String [] args)
    {
        int l=4;
        int r=8;

        System.out.println(fun(l-1)^fun(r));
    }

    public static int fun(int n)
    {
       
        if(n%4==0)
        return n;
        if(n%4==1)
        return 1;
        if(n%4==2)
        return 2;

        return 0;
    }
}
