
import java.util.Arrays;

public class KthSmallest {
    
    public static void main(String [] args)
    {
        int arr[]={1, 3, 2, 1, 4, 2, 5, 6, 3, 3, 4};
        int k=4;

        Arrays.sort(arr);
        int count=0;
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            while(i<arr.length-1&&arr[i]==arr[i+1])
                i++;

                count++;

                if(count==k)
                ans=arr[i];
        }

        System.out.println(ans);
       
    }

}
