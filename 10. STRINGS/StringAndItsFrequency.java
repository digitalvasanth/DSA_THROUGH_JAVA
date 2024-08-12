import java.util.*;
public class StringAndItsFrequency {
    

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
