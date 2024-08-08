import java.util.*;

public class LowAndHighFrequency {
    public static void main(String [] args)
    {
        int arr[]={1,1,1,2,2,24,4,33,33};

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr)

        {
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }

        int minf=Integer.MAX_VALUE;
        int maxf=Integer.MIN_VALUE;
        int minv=0;
        int maxv=0;
        
        for(Map.Entry<Integer,Integer>k:map.entrySet())
        {
            int element=k.getKey();
            int count=k.getValue();

            if(count>maxf)
            {
                maxv=element;
                maxf=count;
            }
            if(count<minf)
            {
                minf=count;
                minv=element;
            }
        }


        System.out.println("The highest frequency element is "+maxv);
        System.out.println(" the least frq is "+minv);
    }
    
}
