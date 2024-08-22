/*
 Input Format: arr[] = {4,1,2,1,2}
Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.
 */

 /*
  BRUTE FORCE
public static int find(int arr[], int n)
    {
        for(int i=0;i<n;i++) 
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                    count++;
            }
            if(count==1)
                return arr[i];
        }

        return -1;
    }

    BETTER APPROACH
    public static int find(int arr[], int n)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr)
        map.put(i,map.getOrDefault(i,0)+1);

        for(Map.Entry<Integer,Integer>e:map.entrySet())
        {
            int k=e.getKey();
            int v=e.getValue();
            if(v==1)
            return k;

        }
        return -1;
    }
  */
  //OPTIMAL APPROACH 
import java.util.*;
public class AppearsOnceAllAreTwice {
    
    public static void main(String [] args)
    {
        int arr[]={4,1,2,1,2};

        
        System.out.println(find(arr,arr.length));
    }
    public static int find(int arr[], int n)
    {
        int ans=0;

        for(int i:arr)
        ans^=i;

        return ans;
    }
    
}
