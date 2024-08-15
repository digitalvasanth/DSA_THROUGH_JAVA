/*
 Input: [1,2,4,7,7,5]
Output: Second Smallest : 2 Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2
 */

public class SecondSmallestLargest {
    
    public static void main(String [] args)
    {
        int arr[]={1,2,4,7,7,5};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;


        for(int i:arr)
        {
            if(i<min)
            min=i;
            if(i>max)
            max=i;
        }

        for(int i:arr)
        {
            if(i>smax&&i!=max)
            smax=i;

            if(i<smin&&i!=min)
            smin=i;
        }

        System.out.println("Second max "+smax );
        System.out.println("Second min is "+smin);
    }
}
