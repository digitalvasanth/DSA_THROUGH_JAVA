/*
Input Format: A = [4, 2, 2, 6, 4] , k = 6
Result: 4
Explanation: The subarrays having XOR of their elements as 6 are  [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]

1. BRUTE FORCE 
public static void main(String []args)
{
    int arr[]={4, 2, 2, 6, 4};
    int k=6;

    System.out.println(count(arr,arr.length,k));
}

    public static int count(int arr[],int n,int k)
    {

        int c=0;
        for(int i=0;i<n;i++)
        {
            int xor=0;
            for(int j=i;j<n;j++)
            {
                xor^=arr[j];
                if(xor==k)
                    c++;
            }
        }
        return c;
    }

*/
public class CountSubArraysWithXORK
{

public static void main(String []args)
{
    int arr[]={4, 2, 2, 6, 4};
    int k=6;

    System.out.println(count(arr,arr.length,k));
}

    public static int count(int arr[],int n,int k)
    {

            
            
               
    }
}