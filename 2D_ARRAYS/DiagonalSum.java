public class DiagonalSum {
    
    public static void main(String [] args)
    {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    
        int sum=0;

        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr[0].length;j++)
        //     {
        //         //primarydiagonal
        //         if(i==j)
        //         sum+=arr[i][j];
        //         else if(i+j==arr.length-1&&i!=j)
        //         sum+=arr[i][j];

        //     }
        // }
        int n=arr.length;
        for(int i=0;i<n;i++)
         {
            sum+=arr[i][i];
            if(i!=n-i-1)
            sum+=arr[i][n-i-1];
                }
        System.out.println(sum);
    }
}
