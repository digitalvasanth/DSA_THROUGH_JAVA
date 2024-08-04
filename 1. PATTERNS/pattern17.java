//FULL TRIANGLE 
import java.util.*;
public class pattern17{

    public static void main(String args[] )
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        { 
            //SPACE
            for(int j=1;j<=(n-i);j++)
            System.out.print(" ");
            //LETTER
            char ch='A';
            int breakp=((2*i)-1)/2;
            for(int j=1;j<=(2*i)-1;j++){
            System.out.print(ch);
            if(j<=breakp)
            ch++;
            else
            ch--;
            }

            //SPACE
            for(int j=1;j<=(n-i);j++)
            System.out.print(" ");


            System.out.println();
        }
    }
}

