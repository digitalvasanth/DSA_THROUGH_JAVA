
/*
 Input: arr[] = {1 20 40 100 80}, K = 60
Output:  true  
Explanation: Pairs with difference 60 are (20,80)
 */
import java.util.*;
public class PairWithDifferenceK{
    
    public static void main(String [] args)
    {
        int arr[]={12 ,45, 52, 65, 21, 645 ,234 ,14 ,575, 112};
        int x=11;
        Arrays.sort(arr);
        System.out.println(check(arr,arr.length,x));
    }

    public static boolean check(int arr[], int n, int x)
    {   
       
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            int k=x+arr[i];
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
