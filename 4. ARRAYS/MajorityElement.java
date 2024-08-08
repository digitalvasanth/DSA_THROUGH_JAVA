/*
 Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Input: nums = [3,2,3]
Output: 3
WE CAN USE Boyer-Moore Voting Algorithm.
*/
public class MajorityElement {
    
    public static void main(String [] args)
    {
        int arr[]={2,2,1,1,1,2,2};

        int candidate=0;
        int count=0;

        for(int i:arr)
        {
            if(count==0)
            {
                candidate=i;
                count=1;
            }
            else if(i==candidate)
                count++;
            else 
                count--;
        }
        System.out.println(candidate);
    }
}
