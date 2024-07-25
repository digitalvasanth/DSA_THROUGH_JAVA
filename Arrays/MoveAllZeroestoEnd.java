public class MoveAllZeroestoEnd {
    
    public static void main(String [] args)
    {
        int arr[]={1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n=arr.length;
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }
        


        for(int i=j+1;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }

        for(int i:arr)
        System.out.println(i);


    }
}
