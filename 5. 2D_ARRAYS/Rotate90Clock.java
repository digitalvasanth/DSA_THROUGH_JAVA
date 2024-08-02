public class Rotate90Clock {
    
    public static void main(String [] args)
    {
       int arr[][]={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

       //transpose
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {  
                int  temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

//reverse the rows means swap right part of half matrix
            for(int i=0;i<arr.length;i++)
            {
                int li=0;
                int ri=arr[0].length-1;

                while(li<ri)
                {
                    int temp=arr[i][li];
                    arr[i][li]=arr[i][ri];
                    arr[i][ri]=temp;

                    li++;
                    ri--;
                }
            }
            System.out.println("After rotation ");
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[0].length;j++)
                System.out.print(arr[i][j]+" ");

                System.out.println();
            }

       

        
    }
}
