
public class InsertionSort {
    public static void main(String [] args)
    {
        int arr[]={0 ,1, 1, 0, 1};
        insertionsort(arr,arr.length);
        for(int i:arr)
        System.out.print(i+" ");
    }


    public static void insertionsort(int arr[], int n)
    {
        for(int i=0;i<n;i++) {
            int j=i;

            while(j>0&&arr[j-1]>arr[j])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}