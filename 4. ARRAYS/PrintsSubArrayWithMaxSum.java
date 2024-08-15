/*
 Input: arr = [-2,1,-3,4,-1,2,1,-5,4] 
Output: [4,-1,2,1]
Explanation: [4,-1,2,1] has the largest sum = 6. 
 */
public class PrintsSubArrayWithMaxSum {
    
    public static void main(String [] args)
    {
        int arr[]={ -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ansStart=-1;
        int ansEnd=-1;
        int start=0;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
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
        for(int k=ansStart;k<=ansEnd;k++)
        System.out.print(arr[k]+" ");
    }
}
