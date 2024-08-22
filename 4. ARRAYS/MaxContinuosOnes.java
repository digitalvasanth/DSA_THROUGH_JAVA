/*
 Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 */
public class MaxContinuosOnes {
    public static void main(String [] args)
    {
        int arr[]={1, 1,1,1,1, 0, 1, 1, 1};
        int n=arr.length;

        System.out.println(find(arr,n));
    }

    public static int find(int arr[], int n)
    {
        int count=0;
        int maxcount=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
                count++;
            else
                count=0;

            maxcount=Math.max(maxcount,count);
        }
        return maxcount;
    }
}
