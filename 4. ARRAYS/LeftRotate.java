/* also called as Clockwise Rotation
 Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , d = 3
Output: 4 5 6 7 1 2 3
Explanation: The array is rotated to the left by 3 positions.
 */
public class LeftRotate {
    public static void main(String [] args){
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=3;
        for(int i=0;i<n ;i++)
        {
            System.out.print(arr[(i+k)%n]+" ");
        }

    }
}
