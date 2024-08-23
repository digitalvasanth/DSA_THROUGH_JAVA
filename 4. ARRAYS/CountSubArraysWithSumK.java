/*
 Input Format:
 N = 4, array[] = {3, 1, 2, 4}, k = 6
Result: 2
Explanation: The subarrays that sum up to 6 are [3, 1, 2] and [2, 4].

1. ( BRUTE FORCE )
public static int count(int arr[], int n,int k)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==k)
                    count++;
            }
        }
        return count;
    }
 */
// 2. ( OPTIMAL )
import java.util.*;

public class CountSubArraysWithSumK
{
    public static void main(String [] args)
    {
        int arr[]={3,1,2,4};
        int k=6;
        int n=arr.length;
        System.out.println(count(arr,n,k));
    }

    public static int count(int arr[], int n,int k)
    {

        HashMap<Integer,Integer>map=new HashMap<>();

        map.put(0,1);
        int prefix=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            prefix+=arr[i];
            map.put(prefix,map.getOrDefault(prefix,0)+1);

            if(map.containsKey(prefix-k))
            {
                count+=map.get(prefix-k);
            }
        }

        return count;
    }
}