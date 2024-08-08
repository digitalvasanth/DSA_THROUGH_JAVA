/* KADANE'S ALGORITHM
 Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */
public class MaxSubArraySum {
    public static void main(String [] args)
    {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i:arr)
        {
            sum+=i;
            maxsum=Math.max(sum,maxsum);

            if(sum<0)
            sum=0;

        }
        System.out.println(maxsum);
    }
    
}
