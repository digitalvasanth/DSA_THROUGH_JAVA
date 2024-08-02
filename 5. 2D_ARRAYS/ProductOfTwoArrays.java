public class ProductOfTwoArrays {
    
    public static void main(String [] args)
    {
        int arr1[][]=  {{1,2},{3,-1}};
        int arr2[][]=   { {1,-2,3 }, {2,3,-1} };
        

        int r1=arr1.length;
        int c1=arr1[0].length;
        int r2=arr2.length;
        int c2=arr2[0].length;
        int prod[][]=new int[r1][c2];

        for(int i=0;i<prod.length;i++)
        {
            for(int j=0;j<prod[0].length;j++)
            {
                for(int k=0;k<c1;k++)
                {
                    prod[i][j]+=(arr1[i][k]*arr2[k][j]);
                }
            }
        }

        for(int i=0;i<prod.length;i++)
        {
            for(int j=0;j<prod[0].length;j++)
            {
                System.out.print(prod[i][j]+" ");
            }
            System.out.println();
        }
    }
}
