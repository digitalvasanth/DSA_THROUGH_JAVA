import java.util.*;
public class CountUniqueElements {
    
    public static void main(String [] args)
    {
        int[] arr = {30, 50, 30, 10, 20, 40, 10, 20};

        HashSet<Integer>set=new HashSet<>();

        for(int i:arr)
        set.add(i);

        System.out.println("Unique elements: "+set.size());
    }

}


/*
                     Another Approach
                     
 Arrays.sort(arr);
 int count=1;

 for(int i=1;i<n;i++)
 {
    if(arr[i]!=arr[i-1])
        count++;
 }
        sout(count);
 
 */