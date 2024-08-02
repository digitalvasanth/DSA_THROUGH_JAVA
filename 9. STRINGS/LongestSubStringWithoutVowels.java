public class LongestSubStringWithoutVowels {
    
    public static void main(String [] args)
    {
        String s="smartinterviews";
        System.out.println(func(s));
    }

    public static int func(String s)
    {
        int count=0;
        int ans=0;
        String vowels="aeiouAEIOU";
        for(char ch:s.toCharArray())
        {
            if(!vowels.contains(String.valueOf(ch))){
                count++;
                ans=Math.max(ans,count);
              }
              else
              count=0;
        }

        return ans;
    }
}
