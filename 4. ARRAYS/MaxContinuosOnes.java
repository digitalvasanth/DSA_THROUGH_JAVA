/*
 Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:
 */
public class MaxContinuosOnes {
    
    public static void main(String [] args)
    {
        int arr[]={1, 1, 0, 1, 1, 1};

        int c=0;
        int maxc=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i==1)
            c++;
            else
            c=0;

            maxc=Math.max(maxc,c);

        }
        System.out.println(maxc);


    }
}
