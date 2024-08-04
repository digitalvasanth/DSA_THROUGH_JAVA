// DIAMOND (PYRAMID+REVERSE PYRAMID)
import java.util.*;
public class pattern9{

    public static void main(String args[] )
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //PYRAMID
        for(int i=1;i<=n;i++)
        {
            //SPACE1
            for(int j=1;j<=n-i;j++)
            System.out.print(" ");

            //stars
            for(int j=1;j<=(2*i-1);j++)
            System.out.print("*");

            //SPACE2
            for(int j=1;j<=n-i;j++)
            System.out.print(" ");


            System.out.println();
        }


        //REVERSE PYRAMID
        for(int i=1;i<=n;i++)
        {
            //SPACE1
            for(int j=1;j<i;j++)
            System.out.print(" ");

            //stars
            for(int j=1;j<=(2*n)-(2*i-1);j++)
            System.out.print("*");

            //SPACE2
            for(int j=1;j<i;j++)
            System.out.print(" ");

            System.out.println();
        }
    }
}

