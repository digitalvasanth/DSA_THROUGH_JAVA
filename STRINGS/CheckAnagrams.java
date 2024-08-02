
import java.util.Arrays;

public class CheckAnagrams {
    
    public static void main(String [] args)
    {
        String s1="iamlordvoldemort";
        String s2="tommarvoloriddle";

        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean check=Arrays.equals(arr1,arr2);

        System.out.println(check);
    }
}
