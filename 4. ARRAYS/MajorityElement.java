/*
 Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
Input: nums = [3,2,3]
Output: 3

/*
 1. ( BRUTE FORCE )
    public static int find(int arr[], int n)
    {
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                    count++;
            }
            if(count>=(n/2))
            return arr[i];
        }
        return -1;
    }

    2. ( BETTER )
    public static int find(int arr[], int n)
    {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i:arr)
        map.put(i,map.getOrDefault(i,0)+1);

        for(Map.Entry<Integer,Integer>e:map.entrySet())
        {
            int k=e.getKey();
            int v=e.getValue();

            if(v>(n/2))
            return k;
        }
        return -1;
    }
*/
//3. OPTIMAL ( Boyer-Moore Voting Algorithm.)
public class MajorityElement {
    
    public static void main(String [] args)
    {
        int arr[]={2,2,1,1,1,2,2};
        int n=arr.length;

        System.out.println(find(arr,n));
       
    }

    public static int find(int arr[], int n)
    {
       int count=0;
       int candidate=0;

       for(int i=0;i<n;i++)
       {
        if(count==0)
        {
            count=1;
            candidate=arr[i];
        }
        else if(candidate==arr[i])
            count++;
        else 
            count--;
       }

       return candidate;
    }

}
