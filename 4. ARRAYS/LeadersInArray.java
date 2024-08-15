import java.util.*;
public class LeadersInArray
{
    public static void main(String [] args)
    {
        int arr[]={10, 22, 12, 3, 0, 6};

        printleaders(arr,arr.length);
    }

    public static void printleaders(int arr[], int n)
    {
       ArrayList<Integer>ans=new ArrayList<>();

       int max=arr[n-1];
       //last element of array is always a leader
        ans.add(max);
       for(int i=n-2;i>=0;i--)
       {
        if(arr[i]>=max)
        {
            max=arr[i];
            ans.add(max);
        }
       }
       //to obtain exact order
       Collections.sort(ans,Collections.reverseOrder());

       for(int i:ans)
       System.out.print(i+" ");
    }
}