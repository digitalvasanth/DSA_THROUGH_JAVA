import java.util.*;
public class FindUnion {
    
    public static void main(String [] args)
    {
        int arr[]={1,2,3,4};
        int arr2[]={3,4,5,6,7};

        HashSet<Integer>set=new HashSet<>();
        for(int i:arr)
        set.add(i);

        for(int i:arr2)
        set.add(i);

        for(int i:set)
        System.out.println(i);
    }
}
