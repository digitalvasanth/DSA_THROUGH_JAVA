
import java.util.Arrays;
import java.util.Collections;


/*
 Input : 1, 2, 3, 4, 5
Output :5, 4, 3, 2, 1

1. (USE SWAPPING )
public static void reverse(int arr[], int n)
    {
      for(int i=0;i<n/2;i++)
      {
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
      }
    }
 */

 // USING COLLECTIONS REVERSE
public class ReverseArray {
    public static void main(String [] args)
    {
     Integer arr[]={1,2,3,4,5};
      int n=arr.length;

      reverse(arr,n);
      for(int i:arr)
      System.out.print(i+" ");
 
    }
    public static void reverse(Integer arr[], int n)
    {
     Collections.reverse(Arrays.asList(arr));
    }
}
