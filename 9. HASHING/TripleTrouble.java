import java.util.*;
public class TripleTrouble {
    
    public static void main(String[] args) {
        int arr[]={5,7,8, 7, 7, 9, 5, 9 ,5 ,9};
        System.out.println(find(arr,arr.length));
    }
    
    public static int find(int arr[],int n)
    {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
               map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }

        for(Map.Entry <Integer,Integer>element:map.entrySet())
        {
            int value=element.getValue();
            if(value==1)
            return element.getKey();
        }

        return -1;
    }
}
