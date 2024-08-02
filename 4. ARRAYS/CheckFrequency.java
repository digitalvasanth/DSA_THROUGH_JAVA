
import  java.util.*;
public class CheckFrequency {
    public static void main(String [] args)
    {
        int arr[]={1,1,1,2,2,24,4,33,33};

        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i:arr)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i)+1);

            }
            else
                map.put(i,1);
        }
        int ele=33;
        for(Map.Entry<Integer,Integer>k:map.entrySet())
        {
            if(ele==k.getKey())
                System.out.println(k.getValue());
        }


    }
}
