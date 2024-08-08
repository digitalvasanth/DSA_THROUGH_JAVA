import java.util.*;
public class FirstCharacterRepeating {
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
                return ch;
            else
                map.put(ch,1);
        }
        return '.';
    }
}
