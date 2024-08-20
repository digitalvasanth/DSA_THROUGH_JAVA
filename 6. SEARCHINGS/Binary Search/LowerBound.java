/*
 Input : N = 4, arr[] = {1,2,2,3}, x = 2
Output: 1
Explanation: Index 1 is the smallest index such that arr[1] >= x.
 */
public class LowerBound {
    
    public static void main(String [] args)
    {
        int arr[]={3,5,8,15,19};
        int x=9;
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]>=x)
            {
                ans=mid;
                high=mid-1;
            }
            else 
                low=mid+1;
        }

       System.out.println("Lower Bound at "+ans);
    }
}
