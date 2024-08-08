//CHESSBOARD PATTERN
public class pattern22 {
    
    public static void main(String[] args)
    {
        int n=5;

        for(int i=0;i<2*n;i++)
        {
            for(int j=0;j<2*n;j++)
            {
                if((i/2+j/2)%2==0)
               System.out.print("*");
               else
               System.out.print("-");

               

            }
            System.out.println();
        }
    }
}
