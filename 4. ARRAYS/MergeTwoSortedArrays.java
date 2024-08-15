/*
 Input: nums1 = [1,2,3,0,0,0], nums2 = [2,5,6]
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 */

public class MergeTwoSortedArrays {
    
    public static void main(String [] args)
    {
        int arr1[]={3,4,6,8};
        int arr2[]={2,5,6};

        merge(arr1,arr2);
    }
    public static void merge(int arr1[], int arr2[]){
    
        int n1=arr1.length;
        int n2=arr2.length;
        int p1=0;
        int p2=0;
        while(p1<n1&&p2<n2) {
            if(arr1[p1]<=arr2[p2]){
            System.out.print(arr1[p1]+" ");
            p1++;
            }
            else{
                System.out.print(arr2[p2]+" ");
                p2++;
            }
        }
        while(p1<n1){
        System.out.print(arr1[p1]+" ");
        p1++;
        }
        while(p2<n2){
            System.out.print(arr2[p2]+" ");
            p2++;
            }
    }
}
