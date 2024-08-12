/*
 Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
 */


public class MergeStringsAlternatively {
    
    public static void  main(String [] args)
    {
        String s1="abc";
        String s2="pqr";

        StringBuilder sb=new StringBuilder();

        int p1=0;
        int p2=0;

        while(p1<s1.length()&&p2<s2.length())
        {
            sb.append(s1.charAt(p1));
            p1++;

            sb.append(s2.charAt(p2));
            p2++;

        }

        while(p1<s1.length())
        sb.append(s1.charAt(p1));


        while(p2<s2.length())
        sb.append(s2.charAt(p2));


        System.out.println(sb.toString());

    }
}
