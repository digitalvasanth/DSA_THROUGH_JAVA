/*
 You are given an integer array and a positive integer K. You have to tell if there exists i,j,k in the given array such that ar[i]+ar[j]+ar[k]=K, i≠j≠k.
Input: arr[]={12 45 52 65 21 645 234 -100 14 575 -80 112} ,k=54
Output: true
 */
import java.util.*;

public class TripletWithSumK {
    
    public static void main(String [] args)
    {
        int arr[]={12,45,52,65,21,645,234,-100,14,575,-80,112};
        int k=54;

        Arrays.sort(arr);
        boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
            if(bs(arr,arr.length,i+1,arr.length-1,k-arr[i]))
                {
                    found=true;
                    break;
                }
        }
        if(found)
            System.out.println(true);
        else
            System.out.println("false");
    }

    public static boolean bs(int arr[], int n,int low, int high, int target)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[low]+arr[high]==target)
                return true;
            else if(arr[low]+arr[high]<target)
                low++;
            else
                high--;
        }
        return false;
    }
}
