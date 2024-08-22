/*
 Input Format: arr = [4,5,6,7,0,1,2,3], k = 0
Result: 4
Explanation: Here, the target is 0. We can see that 0 is present in the given rotated sorted array, nums. Thus, we get output as 4, which is the index at which 0 is present in the array.
 */
public class SearchInRotatedSortedArray1 {
    
    public static void main(String [] args)
    {
        int arr[]={4,5,6,7,0,1,2,3};
        int k=0;

        System.out.println(func(arr,arr.length,k));
    }


    public static int func(int arr[], int n, int k)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            
            if(arr[mid]==k)
            return mid;
            //left to it is Sorted
            if(arr[low]<=arr[mid])
            {
                if(k>=arr[low]&&k<=arr[mid])
                    high=mid-1;
                else 
                    low=mid+1;
            }
            //right to it is Sorted
            else
            {
                if(k<=arr[mid]&&k>=arr[high])
                    low=mid+1;
                else
                    high=mid-1;
            }


        }
        return -1;
    }
}
