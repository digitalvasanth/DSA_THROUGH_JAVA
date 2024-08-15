/*
 Input: arr[] = {1, 5, 7, -1}, K = 6
Output:  2
Explanation: Pairs with sum 6 are (1, 5) and (7, -1).
 */
public class SumOfPairs {
    
    public static void main(String [] args)
    {
        int arr[]={-4 ,0 ,10, -7};
        int x=7;

        System.out.println(check(arr,arr.length,x));
    }

    public static boolean check(int arr[], int n, int x)
    {
        for(int i=0;i<n;i++)
        {
            int k=x-arr[i];
            if(bs(arr,n,k))
                return true;
        }
        return false;

        
    }
    public static boolean bs(int arr[], int n, int k)
{
    int low=0;
    int high=n-1;

    while(low<=high)
    {
        int mid=(low+high)/2;

        if(arr[mid]==k)
        return true;
        else if(arr[mid]<k)
        low=mid+1;
        else 
        high=mid-1;
    }
    return false;
}

}
