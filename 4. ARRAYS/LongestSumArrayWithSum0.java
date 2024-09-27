/*
 Input: N = 6, array[] = {9, -3, 3, -1, 6, -5}
Result: 5
Explanation: The following subarrays sum to zero:
{-3, 3} , {-1, 6, -5}, {-3, 3, -1, 6, -5}
Since we require the length of the longest subarray, our answer is 5!


1. BRUTE FORCE

public static int find(int arr[],int n)
    {
        Arrays.sort(arr);
        int max=0;
        
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==0)
                max=Math.max(max,j-i+1);
            }
        }
        return max;

    }
 */
// 2. OPTIMAL 
import java.util.*;
public class LongestSumArrayWithSum0 {
    
    public static void main(String [] args)
    {
        int arr[]={9, -3, 3, -1, 6, -5};
       System.out.println(find(arr,arr.length));

    }

    public static int find(int arr[],int n)
    {
       Map<Integer,Integer>map=new HashMap<>();
        int max=0;
        int sum=0;
       for(int i=0;i<n;i++)
       {
            sum+=arr[i];
            if(sum==0)
            max=i+1;
            else
            {
                if(map.get(sum)!=null)
                max=Math.max(max,i-map.get(sum));
                else
                map.put(sum,i);
            }
       }
       return max;
    }
}
