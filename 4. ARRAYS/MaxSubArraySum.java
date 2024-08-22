/*
 Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

1. (BRUTE FORCE )
public static int find(int arr[], int n)
{
    int maxsum=Integer.MIN_VALUE;

    for(int i=0;i<n;i++) 
    {
        int sum=0;
        for(int j=i;j<n;j++)
        {
            sum+=arr[j];
            maxsum=Math.max(maxsum,sum);
        }
    }
    return maxsum;
}
2. OPTIMAL (KADANE'S ALOGRITHM)
public static int find(int arr[], int n)
{
    int sum=0;
    int maxsum=Integer.MIN_VALUE;
    for(int i:arr)
    {
        sum+=i;
        maxsum=Math.max(maxsum,sum);

        if(sum<0)
            sum=0;
    }
    return maxsum;
}


*/

// IF U WANT TO PRINT THAT MAX-SUB ARRAY
public class MaxSubArraySum {
    public static void main(String [] args)
    {
        int arr[]={5,4,-1,7,8};
        int n=arr.length;

        System.out.println(find(arr,n));
    
}

public static int find(int arr[], int n)
{
    int sum=0;
    int maxsum=Integer.MIN_VALUE;
    int start=0;
    int ansStart=-1;
    int ansEnd=-1;
    for(int i=0;i<n;i++)
    {
        if(sum==0)
        start=i;

        sum+=arr[i];
        if(sum>maxsum)
       {
        maxsum=sum;
        ansStart=start;
        ansEnd=i;
       }

        if(sum<0)
            sum=0;
    }

    System.out.print("[");
    for(int j=ansStart;j<=ansEnd;j++)
    {
        System.out.print(arr[j]+" ");
    }
    System.out.println("]");
    return maxsum;
}
}