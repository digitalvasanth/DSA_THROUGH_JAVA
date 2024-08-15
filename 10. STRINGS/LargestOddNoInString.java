/*
Input: num = "52"
Output: "5"
Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
 */
public class LargestOddNoInString {
    
    public static void main(String [] args)
    {
        String s="35427";
        System.out.println(func(s));
    }
    public static String func(String num) {
        
        for(int i=num.length()-1;i>=0;i--)
        {
            char ch=num.charAt(i);
            if(ch%2!=0)
            return num.substring(0,i+1);
        }
        return "";
    }
}
