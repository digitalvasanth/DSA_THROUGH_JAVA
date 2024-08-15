/*
 Example 1:
Input: arr[1,1,2,2,2,3,3]
Output: [1,2,3]
 */
import java.util.*;
public class RemoveDuplicates {
    public static void main(String [] args)
    {
        int arr[]={1,1,1,2,2,2,33,3,33};

        HashSet<Integer>set=new HashSet<>();

        for(int i:arr)
        {
            set.add(i); 
        }

        for(int z:set)
        {
            System.out.println(z+" ");
        }

    }   
}
