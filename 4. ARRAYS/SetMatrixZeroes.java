
import java.util.Arrays;

/*
 Input:
 matrix=[[1,1,1],
        [1,0,1],
        [1,1,1]]
Output:[[1,0,1],
        [0,0,0],
        [1,0,1]]
Explanation: Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0.


1. ( BRUTE FORCE )
public static void change(int matrix[][])
{

    //making every row and every col to zeroth ele as -1
    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]==0)
            {
                makerow(i,matrix);
                makecol(j,matrix);
            }
        }
    }

    //making every -1 ele as 0
    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]==-1)
                matrix[i][j]=0;
        }
    }
}

//making whole row as -1
public static void makerow(int i,int matrix[][])
{
    for(int j=0;j<matrix[0].length;j++)
    {
        if(matrix[i][j]!=0)
            matrix[i][j]=-1;
    }
}

//making whole col as -1
public static void makecol(int j,int matrix[][])
{
    for(int i=0;i<matrix.length;i++)
    {
        if(matrix[i][j]!=0)
            matrix[i][j]=-1;
    }
}


 */

 //2. (OPTIMAL )
public class SetMatrixZeroes {
    
public static void main(String [] args)
{
    int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
    change(matrix);

    System.out.println("After change");

    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
}

public static void change(int matrix[][])
{
    int row[]=new int [matrix.length];
    int col[]=new int[matrix[0].length];

    Arrays.fill(row,0);
    Arrays.fill(col,0);

    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]==0)
            {
                row[i]=1;
                col[j]=1;
            }
        }
    }

    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(row[i]==1 || col[j]==1)
                matrix[i][j]=0;
        }
    }
}
}