/*TRAVERSE 2D ARRAY , IF K PRESENTS IN IT PRINT TRUE ELSE FALSE */
public class SearchIn2DMatrix
{
    public static void main(String [] args)
    {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        int k=8;
        System.out.println(check(arr,k));
    }

    public static boolean check(int arr[][], int k)
    {
       int row=arr.length;
       int col=arr[0].length;

       int low=0;
       int high=row*col-1;

       while(low<high)
       {
        int mid=(low+high)/2;
        if(arr[mid/col][mid%col]==k)
        return true;
        else if(arr[mid/col][mid%col]<k)
        low=mid+1;
        else
        high=mid-1;
       }
       return false;
    }
}