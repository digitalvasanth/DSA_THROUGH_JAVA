public class Sort0And1 {
    
    public static void main(String [] args)
    {
        int arr[]={0 ,1 ,1 ,0 ,1};
        sort(arr);
        for(int i:arr)
        System.out.print(i+" ");
    }
    public static void sort(int arr[])
    {
        int p1=0;
        int p2=arr.length-1;


        while(p1<p2)
        {
            while(arr[p1]==0&&p1<p2)
            p1++;

            while(arr[p2]==1&&p1<p2)
            p2--;

            if(p1<p2)
            {
                int temp=arr[p1];
                arr[p1]=arr[p2];
                arr[p2]=temp;
            }
        }
    }

}
