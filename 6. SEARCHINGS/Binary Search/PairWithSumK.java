
/*
 Input: arr[] = {1, 5, 7, -1}, K = 6
Output:  true
Explanation: Pairs with sum 6 are (1, 5) and (7, -1).
 */
import java.util.*;
public class PairWithSumK {
    
    public static void main(String [] args)
    {
        int arr[]={1,5,7,-1};
        int x=6;
        Arrays.sort(arr);
        System.out.println(check(arr,arr.length,x));
    }

    public static boolean check(int arr[], int n, int x)
    {   
       
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            int k=x-arr[i];
            if(bs(arr,n,i+1,k))
            {
                flag=true;
                break;
             }
        }

        if(flag)
            return true;
        else 
            return false;

        
    }
public static boolean bs(int arr[], int n,int low, int k)
{
    
    int high=n-1;

    while(low<=high)
    {
        int mid=(low+high)/2;

        if(arr[mid]==k)
            return true;
        else if(arr[mid]<k)
            low=mid+1;
        else 
            high=mid-1;
    }
    return false;
}

}
