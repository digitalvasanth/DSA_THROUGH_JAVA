
/* ( ALSO CALLED AS ANTI-CLOCKWISE ROTATION )
 Input: N = 7, array[] = {1,2,3,4,5,6,7} , d = 3
Output: 5 6 7 1 2 3 4
Explanation: The array is rotated to the right by 3 positions.


 */
public class RightRotate {
    
    public static void main(String [] args)
    {
        int arr[]={1,2,3,4,5,6,7};
        int n=arr.length;
        int k=3;

        for(int i=0;i<n;i++)
        System.out.print(arr[(i-k+n)%n]+" ");
    }
}
