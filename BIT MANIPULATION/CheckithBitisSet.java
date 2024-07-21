import java.util.*;
public class CheckithBitisSet {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number");
        long n=sc.nextLong();
        System.out.println("Enter i value ");
        long i=sc.nextLong();

        if(( (n)&(1<<i))!=0)
        System.out.println("Set");
        else
        System.out.println("Not Set");

    }
}
