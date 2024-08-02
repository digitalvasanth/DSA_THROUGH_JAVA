import java.util.*;
class NumberWithX1andY0{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter x");
        int x=sc.nextInt();
        System.out.println("ENter y");
        int y=sc.nextInt();

        int ans=(1<<(x+y))-(1<<y);

        System.out.println(ans);

        
    }
}