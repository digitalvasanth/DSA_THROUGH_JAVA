
import java.util.Arrays;

/*
Input: [100, 200, 1, 3, 2, 4]
Output: 4
Explanation:The longest consecutive subsequence is 1, 2, 3, and 4.

1. (BRUTE FORCE )
- USING NESTED LOOP AND SEARCHING FOR arr[i]+1 in nested loop
-IF FOUND INCREMENT COUNT AND CALCULATE COUNTMAX

2. (BETTER )
public static int find(int arr[],int n)
    {
        Arrays.sort(arr);
        int longest=1;
        int count=0;
        int lastsmallest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i]-1==lastsmallest)
            {
                count++;
                lastsmallest=arr[i];
            }
            else if(arr[i]!=lastsmallest)
            {
                count=1;
                lastsmallest=arr[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
*/
// 3. ( OPTIMAL )
import java.util.*;
public class LongestConsecutiveSequence {
    
    public static void main(String [] args)
    {
        int arr[]={100,200,1,3,2,4};
        int n=arr.length; 
        System.out.println(find(arr,n));
    }


    public static int find(int arr[],int n)
    {
        HashSet<Integer>set=new HashSet<>();
        int longest=1;

        for(int i:arr)
        set.add(i);

        for(int i:set)
        {
           if(!set.contains(i-1))
           {
            int count=1;
            int x=i;
            while(set.contains(x+1))
            {
                x=x+1;
                count++;
            }
            longest=Math.max(longest,count);
           }
        }
        return longest;
    }
}
