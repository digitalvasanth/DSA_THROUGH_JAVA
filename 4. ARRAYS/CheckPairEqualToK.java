/* ALSO KNOWN AS TWO SUM

Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES 
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” 


1. ( BRUTE FORCE )
public static boolean check(int arr[], int n, int k)
    {
       

        for(int i=0;i<n;i++)
        {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]+arr[j]==k)
                return true;
        }
        }  
        return false;     
    }

   2.  ( BETTER )
 public static boolean check(int arr[], int n, int k)
    {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            int curr=arr[i];
            if(map.containsKey(k-curr))
                return true;
            else
                map.put(curr,i);
        }
        return false;
    }

   3.public static boolean check(int arr[], int n, int k)
    {
        Arrays.sort(arr);
       int p1=0;
       int p2=n-1;

       while(p1<=p2)
       {
        if(arr[p1]+arr[p2]==k)
            return true;
        else if(arr[p1]+arr[p2]<k)
            p1++;
        else
            p2--;
       }
       return false;
    }

  
 */
//4. OPTIMAL ( BINART SEARCH )
import java.util.*;
public class CheckPairEqualToK {
    
    public static void main(String [] args){
        int arr[]={2,6,5,8,11};
        int k=14;
        System.out.println(check(arr,arr.length,k));
    }

    public static boolean check(int arr[], int n, int k)
    {
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(binarysearch(arr,n,k-arr[i]))
                return true;
        }
        return false;
    }
    public static boolean binarysearch(int arr[], int n, int target)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            return true;
            else if(arr[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return false;
    }

}
