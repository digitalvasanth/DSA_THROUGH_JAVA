public class CheckSubsetHavingSumK {
    
    public static void main(String [] args)
    {
        int arr[]={5,7,6};
        int k=13;
        System.out.println(subset(arr,arr.length,0,0,k));
    }


    public static boolean subset(int arr[],int n, int sum, int idx, int k)
    {
            if(idx==n)
            return sum==k;

    return subset(arr,n,sum,idx+1,k)||subset(arr,n,arr[idx]+sum,idx+1,k);
    }
}
