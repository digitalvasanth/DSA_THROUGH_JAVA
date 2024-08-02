import java.util.*;
public class FrequencySort{
    
    public static void main(String [] args)
    {
       String s= "tree";
       System.out.println(func(s));
    }


    public static String func(String s)
    {
        HashMap<Character,Integer>map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        map.put(ch,map.getOrDefault(ch,0)+1);

        while(!map.isEmpty())
        {
            int maxfreq=Integer.MIN_VALUE;
            char maxchar='\0';

            for(Map.Entry<Character,Integer>e:map.entrySet())
            {
                if(e.getValue()>maxfreq)
                {
                    maxfreq=e.getValue();
                    maxchar=e.getKey();
                }
            }



            for(int i=0;i<maxfreq;i++)
                sb.append(maxchar);


            map.remove(maxchar);
        }

        return sb.toString();

    }
}