public class LinearSearch {
    
    public static void main(String [] args)
    {
        int arr[]={34,2,4,2,222,688};
        int key=222;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
