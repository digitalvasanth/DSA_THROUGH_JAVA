/*
 Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
 */

public class LongestPalindromicSubString {
    
    public static void main(String [] args)
    {
        String s="mzmqnnrkurfmmfrukrnnqsm";
        System.out.println(func(s));
    }


    public static int func(String s)
    {   int n=s.length();
        int ans=1;
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            int p1=i;
            int p2=i;
            while(p1>=0&&p2<n&&arr[p1]==arr[p2])
            {
                p1--;
                p2++;
            }
            ans=Math.max(ans,p2-p1-1);
            int p3=i;
            int p4=i+1;
            while(p3>=0&&p4<n&&arr[p3]==arr[p4])
            {
                p3--;
                p4++;
            }
            ans=Math.max(ans,p4-p3-1);


        }
        return ans;
    }
}
