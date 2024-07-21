import java.util.*;

public class pattern18{

    public static void main(String args[] )
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        { 
            for(char ch=(char)('E'-i+1);ch<='E';ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}

