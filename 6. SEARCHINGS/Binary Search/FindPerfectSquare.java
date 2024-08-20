public class FindSqaureRoot {
    
    public static void main(String [] args)
    {
        int n=36;
        System.out.println(func(n));
    }

    public static int func(int n)
    {
        int low=1;
        int high=n;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int val=mid*mid;

            
            if(val<=n)
                low=mid+1;
            else 
                high=mid-1;
        }
        return high;
    }
}
