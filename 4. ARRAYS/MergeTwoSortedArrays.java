/*
Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8} 
Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
 */

public class MergeTwoSortedArrays {
    
    public static void main(String [] args)
    {
            int arr1[]={1,3,4,5};
            int arr2[]={2,4,6,8};
            int n=arr1.length;
            int m=arr2.length;

            func(arr1,n,arr2,m);
    }

    public static void func(int arr1[], int n, int arr2[], int m)
    {
        int newarr[]=new int[n+m];

        int p1=0;
        int p2=0;
        int idx=0;
        while(p1<n&&p2<m)
        {
            if(arr1[p1]<=arr2[p2])
            {
                newarr[idx++]=arr1[p1++];
            }
            else
            {   
               
                newarr[idx++]=arr2[p2++];
            }
        }
        while(p1<n)
        newarr[idx++]=arr1[p1++];

        while(p2<m) 
        newarr[idx++]=arr2[p2++];

        for(int i:newarr)
        System.out.print(i+" ");
    }

}
