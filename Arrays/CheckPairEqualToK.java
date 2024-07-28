
import java.util.Arrays;

public class CheckPairEqualToK {
    
    public static void main(String [] args){
        int arr[]={5,1,-40,20, 6,8,7};
        int k=15;
        System.out.println(check(arr,arr.length,k));
    }

    public static boolean check(int arr[], int n,int k)
    {   Arrays.sort(arr);
        int p1=0;
        int p2=n-1;

        while(p1<p2)
        {
            if(arr[p1]+arr[p2]==k)
            return true;
            else if(arr[p1]+arr[p2]>k)
                p2--;
            else 
            p1++;
        }
        return false;
    }
}
