
 public class TowersOfHanoi {
    
    public static void main(String [] args)
    {
        int n=3;
        char src='A';
        char temp='B';
        char dest='C';
        System.out.println((int)Math.pow(2,n)-1 +" Moves");

        toh(src,dest,temp,n);
    }
    public static void toh(char src, char dest, char temp, int n)
    {
            if(n==0)
            return ;

            toh(src,temp,dest,n-1);

            System.out.println("Moved "+n+" from"+src+" to "+dest);
            toh(temp,dest,src,n-1);
    }
}
