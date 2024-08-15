//Given an array, you have to find the floor of a number x. The floor of a number x is nothing but the largest number in the array less than or equal to x.
/*
 arr[]= [-6 10 -1 20 15 5], x=5
 Output= -1
 */

import java.util.Arrays;
public class PrintFloor {
    public static void main(String [] args)
    {
        int arr[]={-6 ,10, -1, 20, 15, 5};
        Arrays.sort(arr);
        int x=-4;
        System.out.println(func(arr,arr.length,x));
    }


    public static int func(int arr[],int n, int x)
    {
        
        int ans=Integer.MIN_VALUE;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            return arr[mid];
            else if(arr[mid]<x)
                {
                    ans=arr[mid];
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
        }
        return ans;
    }
}
