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
