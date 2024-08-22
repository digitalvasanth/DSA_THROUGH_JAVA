/*
 Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation:In the given array, number 3 is missing. So, 3 is the answer.

1.BRUTE FORCE 

public static int find(int arr[], int n)
    {
        for(int i=1;i<=n;i++)
        {   int flag=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]==i)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            return i;
        }
        return -1;
    }

   2.  ( BETTER APPROACH )

    public static int find(int arr[], int n)
    {
        int count[]=new int [n+1];
        for(int i=0;i<n-1;i++)
        count[arr[i]]++;

        for(int i=1;i<=n;i++)
        {
            if(count[i]==0)
                return i;
        }
        return -1;
    }

    3. public static int find(int arr[], int n)
    {
        int actualsum=0;
        int totalsum=(n*(n+1))/2;

        for(int i=0;i<n;i++)
        actualsum+=i;

        return (totalsum-actualsum);
    }

 */
// 4. OPTIMAL APPROACH
public class FindMissing {
    
    public static void main(String [] args)
    {
        int arr[]={1,2,3,4,5,7};
        int n=arr.length;

        System.out.println(find(arr,n));
    }

    public static int find(int arr[], int n)
    {
        int actualsum=0;
        int totalsum=(n*(n+1))/2;

        for(int i=0;i<n;i++)
        actualsum+=i;

        return (totalsum-actualsum);
    }
}
