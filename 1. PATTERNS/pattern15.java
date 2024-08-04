//REVERSE RIGHT ANGLED TRIANGLE WITH CHARACTERS
import java.util.*;
public class pattern15{

    public static void main(String args[] )
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
           for(char ch='A';ch<='A'+(n-i);ch++)
           {
            System.out.print(ch+" ");
           }
           System.out.println();

           
            
        }
    }
}

