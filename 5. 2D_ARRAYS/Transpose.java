/*
 Matrix
a11    a12    a13
a21    a22    a23
Transposed Matrix
a11    a21
a12    a22
a13    a23
 */
public class Transpose {
    
    public static void main(String [] args)
    {
        int arr[][]={ {2, 3, 7}, {5, 6, 7} };
        System.out.println("Before Transpose");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int newarr[][]=new int[arr[0].length][arr.length];
       
        for(int i=0;i<newarr.length;i++)
        {
            for(int j=0;j<newarr[0].length;j++)
            {
                newarr[i][j]=arr[j][i];
            }
        }
        System.out.println("After Transpose");
        for(int i=0;i<newarr.length;i++)
        {
            for(int j=0;j<newarr[0].length;j++)
            {
                System.out.print(newarr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}

