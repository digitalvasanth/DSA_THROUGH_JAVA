/*
 Input: 1,2,0,1,0,4,0
Output: 1,2,1,4,0,0,0
Explanation:All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

1. ( BRUTE FORCE )
public static void change(int arr[], int n)
    {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
                list.add(arr[i]);
        }
        int nz=list.size();

        for(int i=0;i<nz;i++)
        arr[i]=list.get(i);

        for(int j=nz;j<n;j++)
        arr[j]=0;
    }
 */
// 2. OPTIMAL 
public class MoveAllZeroestoEnd {
    
    public static void main(String [] args)
    {
        int arr[]={1,2,0,1,0,4,0};
        int n=arr.length;

        change(arr,n);

        for(int i:arr)
        System.out.print(i+" ");
    }

    public static void change(int arr[], int n)
    {
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }

        for(int k=j+1;k<n;k++)
        {
            if(arr[k]!=0)
            {
                int temp=arr[k];
                arr[k]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}