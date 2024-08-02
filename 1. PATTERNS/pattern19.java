import java.util.*;

public class pattern19{

    public static void main(String args[] )
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        { 
            //star
            for(int j=1;j<=n-i+1;j++)
            System.out.print("*");

            //space
            for(int j=1;j<=2*(i-1);j++)
            System.out.print(" ");

            //star
            for(int j=1;j<=n-i+1;j++)
            System.out.print("*");


            System.out.println();
        }


        for(int i=1;i<=n;i++)
        { 
            //star
            for(int j=1;j<=i;j++)
            System.out.print("*");

            //space
            for(int j=1;j<=(2*n)-(2*i);j++)
            System.out.print(" ");

            //star
            for(int j=1;j<=i;j++)
            System.out.print("*");


            System.out.println();
        }
    }
}

