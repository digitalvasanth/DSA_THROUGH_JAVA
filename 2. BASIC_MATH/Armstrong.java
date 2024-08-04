/*  Input:153
    Output: Yes
    153 is an Armstrong number.
    1*1*1 + 5*5*5 + 3*3*3 = 153 
    */
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
       System.out.println("Yes");
       else
       System.out.println("No");


        
    }
}