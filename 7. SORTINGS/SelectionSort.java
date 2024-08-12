public class SelectionSort {
    
    public static void main(String [] args)
    {
        int arr[]={3,11,35,66,29,20};

        System.out.println("Before Sorting");
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();

        int n=arr.length;
        for(int i=0;i<=n-2;i++)
        {   int minIdx=i;
            for(int j=i;j<=n-1;j++)
            {
                if(arr[j]<arr[minIdx])
                    minIdx=j;

            }
            int temp=arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=temp;
        }

        System.out.println("After Sorting");
        for(int i:arr)
        System.out.print(i+" ");
    }
}
