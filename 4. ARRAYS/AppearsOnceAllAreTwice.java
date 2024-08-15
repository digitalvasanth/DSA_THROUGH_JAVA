/*
 Input Format: arr[] = {4,1,2,1,2}
Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.
 */

public class AppearsOnceAllAreTwice {
    
    public static void main(String [] args)
    {
        int arr[]={4,1,2,1,2};

        int ans=0;

        for(int i:arr)
        ans^=i;


        System.out.println(ans);
    }
}
