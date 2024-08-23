/*
 Given an array of integers of size N, print the sum of sum of all subarrays.
 Input: arr[]={3 ,4 , 5};
 Output: 40
 Explanation: [3] + [3,4] + [3,4,5] + [4] + [4,5] + [5] = 40

 1. ( BRUTE FORCE )
 public static int find(int arr[], int n)
    {
        int totalsum=0;

        for(int i=0;i<n;i++)
        {   int sum=0;
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                }
            }
            totalsum+=sum;
        }
        return totalsum;
    }
 */
// 2. ( OPTIMAL )
public class SumofAllSubArrays {
    
    public static void main(String [] args)
    {
        int arr[]={3,4,5};
        int n=arr.length;

        System.out.println(find(arr,n));
    }

    public static int find(int arr[], int n)
    {
        int totalsum=0;

        for(int i=0;i<n;i++)
        totalsum+=arr[i]*(i+1)*(n-i);

        return totalsum;
    }
}
