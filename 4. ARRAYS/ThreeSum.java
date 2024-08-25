/*
 Example 1:
Input:
 nums = [-1,0,1,2,-1,-4]

Output:
 [[-1,-1,2],[-1,0,1]]
Explanation:
 Out of all possible unique triplets possible, [-1,-1,2] and [-1,0,1] satisfy the condition of summing up to zero with i!=j!=k

 1. ( BRUTE FORCE )
 public static void printpairs(int arr[],int n)
    {
        Set<List<Integer>>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               List<Integer>temp=new ArrayList<>();
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0)
                    temp=Arrays.asList(arr[i],arr[j],arr[k]);
                    temp.sort(null);
                    set.add(temp);
                }
            }
        }
        for(List l:set)
        {
            if(!l.isEmpty())
            System.out.println(l);
        }
    }


2. ( BETTER )

public static void printpairs(int arr[],int n)
    {
        Set<List<Integer>>ans=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            Set<Integer>set=new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                 int third= -(arr[i]+arr[j])  ;
               
                if(set.contains(third)){
                List<Integer>temp=Arrays.asList(arr[i],arr[j],third);
                temp.sort(null);
                ans.add(temp);
                }
                else
                    set.add(arr[j]);   
            }
        }
        for(List l:ans)
        {
            if(!l.isEmpty())
                System.out.println(l);
        }
    }
}

3. ( OPTIMAL )
 */
import java.util.*;
public class ThreeSum {
    
    public static void main(String [] args)
    {
        int arr[]={-1,0,1,2,-1,-4};
        int n=arr.length;
        printpairs(arr,n);
    }

    public static void printpairs(int arr[],int n)
    {

        Arrays.sort(arr);

        Set<List<Integer>>ans=new HashSet<>();
       
        for(int i=0;i<n;i++)
        {
            int p1=i+1;
            int p2=n-1;

            while(p1<p2)
            {
                int sum=arr[i]+arr[p1]+arr[p2];
                if(sum<0)
                   p1++;
                else if(sum>0)
                    p2--;
                else
                   {
                    List<Integer>temp=Arrays.asList(arr[i],arr[p1],arr[p2]);
                    ans.add(temp);
                    p1++;
                    p2--;

                    while(p1<p2&&arr[p1]==arr[p1-1])p1++;
                    while(p1<p2&&arr[p2]==arr[p2+1])p2--;

                   }

            }

            for(List l:ans)
            System.out.println(l);

        }
    }

}
