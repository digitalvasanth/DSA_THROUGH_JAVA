
/*
 Input: Array = [1,2,6,4,5,3] , K = 3 
Output: kth largest element = 4, kth smallest element = 3

 */
import java.util.*;
public class KthSmallest {
    
    public static void main(String [] args)
    {
        int arr[]={1, 3, 2, 1, 4, 2, 5, 6, 3, 3, 4};
        int n=arr.length;
        int k=4;

        find(arr,n,k);
       
    }

    public static void find(int arr[], int n,int k)
    {
        Arrays.sort(arr);
        int largest=arr[k-1];
        int smallest=arr[n-k];

    System.out.println(largest+" is "+k+"th largest. "+smallest+" is "+k+"th smallest");
    }

}
