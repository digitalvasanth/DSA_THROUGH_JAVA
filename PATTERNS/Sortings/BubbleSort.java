

public class BubbleSort
{
    public static void main(String [] args)

{
    int arr[]={55,2,1,33,42,145};
    System.out.println("Before Sorting ");
    for(int i:arr)
    System.out.print(i+" ");


    System.out.println("After Sorting ");

    bubblesort(arr);
    for(int i:arr)
    System.out.print(i+" ");
}


public static void bubblesort(int arr[])
{   int n=arr.length;
    for(int i=0;i<n;i++) 
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[i]>arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        
    }
}
}