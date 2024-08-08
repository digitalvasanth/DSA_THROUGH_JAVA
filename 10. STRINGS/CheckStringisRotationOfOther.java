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