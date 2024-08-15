/*
 Input : str = "elephant"
Output : e2 l1 p1 h1 a1 n1 t1
 */
import java.util.*;
public class CharacterFrequency {
    

public static void main(String [] args)
{
    String s="abbhuabcfghh";

    System.out.println(solve(s));
}

    public static String solve(String A) {
        
        
        HashMap<Character,Integer>map=new HashMap<>();
        for(char c:A.toCharArray())
        map.put(c,map.getOrDefault(c,0)+1);
        
        
        
        StringBuilder sb=new StringBuilder();
        HashSet<Character>set=new HashSet<>();
        for(char c:A.toCharArray())
        {
           if(set.contains(c))
            continue;
            sb.append(c);
            sb.append(map.get(c));
            set.add(c);

        }
        
        
        return sb.toString();
    }
}
