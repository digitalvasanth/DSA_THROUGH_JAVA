public class CheckPalindrome {


  
        public static void main(String [] args)
        {
            int n=4554;
            int temp=n;
            int rev=0;
            while(n!=0)
            {
                int ld=n%10;
                rev=rev*10+ld;
                n=n/10;
            }
            if(rev==temp)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
    
    

