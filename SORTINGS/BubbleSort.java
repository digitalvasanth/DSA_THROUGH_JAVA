

public class BubbleSort {
    public static void main(String [] args)
    {
        int arr[]={0 ,1, 1, 0, 1};
        bubblesort(arr,arr.length);
        for(int i:arr)
        System.out.print(i+" ");
    }
    public static void bubblesort(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
