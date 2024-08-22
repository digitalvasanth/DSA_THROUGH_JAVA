/* 
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.
 */


 /*
  BRUTE FORCE APPROACH (BOTH POSITIVES & NEGATIVES )
  - GENERATE ALL SUBARRAYS AND CALCULATE MAX LEN
   public static int find(int arr[], int n, int k)
    {
        int len=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==k)
                len=Math.max(len,j-i+1);
            }
        }
        return len;
    }
  */

  /*
   BETTER APPROACH (BOTH POSITIVES & NEGATIVES)
   - USING HASHING TO STORE PREFIX SUM AT ITS INDEX
   public static int find(int arr[],int n, int k)
    {
        HashMap<Integer,Integer>prefixmap=new HashMap<>();
        int len=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==k)
            len=Math.max(len,i+1);

            int rem=sum-k;
            if(prefixmap.containsKey(rem))
                len=Math.max(len,i-prefixmap.get(rem));
            
                if(!prefixmap.containsKey(sum))
                prefixmap.put(sum,i);
        }

        return len;
    }
   */

   // OPTIMAL APPROACH (ONY FOR POSITIVES )
public class LongestSubArrayWithSumK {
    
    public static void main(String [] args)
    {

        int arr[]={2,3,5,1,9};
        int n=arr.length;
        int k=10;

        System.out.println(find(arr,n,k));

    }

    public static int find(int arr[], int n, int k)
    {
        int len=0;
        int sum=0;
        int p1=0;
        int p2=0;
        
            while(p2<n)
            {
                sum+=arr[p2];
                //if sum exceeds k shrink window
                while(p1<=p2&&sum>k)
                {
                    sum-=arr[p1];
                    p1++;
                }
                if(sum==k)
                len=Math.max(len,p2-p1+1);

                //move right pointer
                    p2++;
            }

        return len;

    }
    
}
