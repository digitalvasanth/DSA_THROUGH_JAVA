/*
 Example 1:
Input: N = 7, target=13, array[] = {3,4,13,13,13,20,40}
Output: 2,4
Explanation: it appears for the first time at index number 2 and last time at index 4
 */
public class FirstandLastOccurence {
    
    public static void main(String [] args)
    {
        int arr[]={3,4,13,13,13,20,40};
        int n=arr.length;
        int target=13;
        int lb=lowerbound(arr,n,target);
        int up=upperbound(arr,n,target);

        if(arr[lb]!=target||lb==n)
            System.out.println("No element");
        else    
            System.out.println("First at "+lb+ " Last at "+(up-1));
    }

    public static int lowerbound(int arr[],int n,int target)
    {
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high)
        {
            int mid=(low+high)/2;
                if(arr[mid]>=target)
                {
                    ans=mid;
                    high=mid-1;
                }
                else
                    low=mid+1;
        }
        return ans;
    }


    public static int upperbound(int arr[], int n, int target)
    {
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high)
        {
            int mid=(low+high)/2;
        
            if(arr[mid]>target)
            {
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        
        }
        return ans;
    }
}