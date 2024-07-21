
public class Armstrong {

    public static void main(String [] args)
    {
       int number=153;

       int l=String.valueOf(number).length();

       int temp=number;
       int ans=0;


       while(temp!=0)
       {
        int ld=temp%10;
        ans+=Math.pow(ld,l);
        temp=temp/10;
       }
       if(ans==number)
       System.out.println("True");
       else
       System.out.println("False");


        
    }
}