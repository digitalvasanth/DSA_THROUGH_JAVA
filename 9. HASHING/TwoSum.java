/*
 Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

import java.util.*;
public class TwoSum {
    
    public static void main(String [] args)
    {
        int arr[]={2,7,11,15};
        int target=9;
        int ans[]=new int[2];

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int complement=target-arr[i];
            if(map.containsKey(complement))
                {
                    ans[0]=map.get(complement);
                    ans[1]=i;
                }
            else
                map.put(arr[i],i);

        }
        System.out.println(ans[0]+" , "+ ans[1]);
    }
}
