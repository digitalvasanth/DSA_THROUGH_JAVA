public class ElementRepeatingOnceAllAreTwice {
    public static void main(String [] args)
    {
        int arr[]={ 1, 2, 3, 2, 1, 3, 4};

        System.out.println(find(arr));
    }


    public static int find(int arr[])
    {
        int ans=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            ans^=arr[i];
        }

        return ans;
    }
}
