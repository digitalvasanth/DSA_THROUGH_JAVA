/*
 Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.
If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).
 */
public class NextPermutation {
    
public static void main(String [] args)
{
    int arr[]={1,3,2};
    int n=arr.length;
    int idx=-1;
    int idx2=-1;
    //step 1 find break idx
    for(int i=n-2;i>=0;i--)
    {
        if(arr[i]<arr[i+1])
        {
            idx=i;
            break;
        }
    }

    //if break idx not found reverse array
    if(idx==-1)
    reverse(arr,0);
    else
    {
        //step 2 find next greater for break idx ele
        for(int i=n-1;i>idx;i--)
        {
            if(arr[i]>arr[idx])
                idx2=i;
                break;
        }

        swap(arr,idx,idx2);
         //step 3 reverse right half
         reverse(arr,idx+1);
    }


   
    //step 4 print next permutation
    for(int i:arr)
    System.out.print(i+" ");
    

}
public static void  swap(int arr[], int i,int j)
{
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}

public static void reverse(int arr[],int start)
{
    int i=start;
    int j=arr.length-1;

    while(i<j)
    {
        swap(arr,i,j);
        i++;
        j--;    
    }
}
}
