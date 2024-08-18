/*
Input : N = 6, arr[] = {3,5,8,9,15,19}, x = 9
Output: 4
Explanation: Index 4 is the smallest index such that arr[4] > x.
 */
public class UpperBound {
    
    public static void main(String [] args)
    {
        int arr[]={3,5,8,9,15,19};
        int x=9;
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]>x)
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
