/*
 Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
 */

import java.util.ArrayList;

public class ReArrangeBySign {
    public static void main(String [] args)
    {
        int arr[]={3,1,-2,-5,2,-4};
       int ans[]= rearrangeArray(arr);
       for(int i:ans)
       System.out.print(i+" ");
    }

 public static  int[] rearrangeArray(int[] arr) {
        int ans[]=new int[arr.length];

        ArrayList<Integer>pos=new ArrayList<>();
         ArrayList<Integer>neg=new ArrayList<>();

         for(int i:arr)
         {
            if(i<0)
            neg.add(i);
            else
            pos.add(i);
         }

         for(int i=0;i<arr.length/2;i++)
         {
            ans[2*i]=pos.get(i);
             ans[2*i+1]=neg.get(i);
         }

    return ans;
    }

}
