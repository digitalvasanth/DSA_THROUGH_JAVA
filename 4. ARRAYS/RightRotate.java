
public class RightRotate {
    
    public static void main(String [] args)
    {
        int arr[]={1,3,5,7,9};
        int n=arr.length;
        int k=2;

        for(int i=0;i<n;i++)
        System.out.print(arr[(i-k+n)%n]+" ");
    }
}
