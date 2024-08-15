
public class RightRotate {
    
    public static void main(String [] args)
    {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int k=2;

        for(int i=1;i<n;i++)
        System.out.println(arr[(i-1)%n]);
    }
}
