import java.util.*;
public class PrintNoWithXandYBitSet {

    public static void main(String [] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter x ");
    int x=sc.nextInt();
    System.out.println("Enter y");
    int y=sc.nextInt();
        int ans=0;
    if(x!=y)
    ans=(1<<x)+(1<<y);
    else
    ans=(1<<x|1<<y);

    

    System.out.println(ans);

    }
}
