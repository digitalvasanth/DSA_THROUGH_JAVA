/*
 Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example :
Input: s = "leetcode"
Output: "leotcede"
 */
public class ReverseOnlyVowels {
    
    public static void main(String [] args)
    {
        String s="leetcode";

        System.out.println(reversevowels(s));
    }


    public static String reversevowels(String s)
    {
        
        int n=s.length();
        int p1=0;
        int p2=n-1;
        char arr[]=s.toCharArray();
        String vowel="aeiouAEIOU";
        while(p1<p2)
        {
            while(p1<n&&p1<p2&&!vowel.contains(String.valueOf(arr[p1])))
            p1++;

            while(p2>=0&&p1<p2&&!vowel.contains(String.valueOf(arr[p2])))
            p2--;

            if(p1<p2){
            char temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            }
            p1++;
            p2--;
        }

        return new String(arr);

    }
}
