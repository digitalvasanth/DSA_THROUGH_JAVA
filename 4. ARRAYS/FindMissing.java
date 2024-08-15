/*
 Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation:In the given array, number 3 is missing. So, 3 is the answer.
 */

public class FindMissing {
    
    public static void main(String [] args)
    {
        int arr[]={1,2,3,4,5,7};
        int n=arr.length;
        int actualxor=0;
        int expectedxor=0;

        for(int i:arr)
        actualxor^=i;

        for(int i=1;i<=(n+1);i++)
        expectedxor^=i;

        System.out.println(actualxor^expectedxor);
    }
}
