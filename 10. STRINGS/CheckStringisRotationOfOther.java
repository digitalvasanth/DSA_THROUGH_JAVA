/*
 Input: S1 = ABCD, S2 = CDAB
Output: Strings are rotations of each other

Input: S1 = ABCD, S2 = ACBD
Output: Strings are not rotations of each other
 */

public class CheckStringisRotationOfOther

{
    public static void main(String [] args)
    {
        String s="abcde";
        String goal="cdeab";

       System.out.print(check(s,goal));
    }
    public static boolean check(String s, String goal) {
        if(s.length()!=goal.length())
            return false;

        return (s+s).contains(goal);
    }
}