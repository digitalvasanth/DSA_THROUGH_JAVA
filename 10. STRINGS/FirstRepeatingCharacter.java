/*
 Input  : geeksforgeeks
Output : g
(mind that it will be g, not e.)
 */
import java.util.*;
public class FirstRepeatingCharacter{
    public static void main(String [] args)
    {
        String s="smartinterviews";
        System.out.println(func(s));
    }


    public static char func(String s)
    {
        HashMap<Character,Integer>map=new HashMap<>();

        for(char ch:s.toCharArray())
        {
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        for(char ch:s.toCharArray())
        {
            if(map.get(ch)>1)
                return ch;
        }
        return '.';
    }
}