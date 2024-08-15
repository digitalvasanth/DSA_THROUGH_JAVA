/*
 Input: s = "egg", t = "add"
Output: true
 */
public class IsomorphicStrings {
    
    public static void main(String [] args)
    {
        String s1="egg";
        String s2="add";
        System.out.println(func(s1,s2));
    }
    public static boolean func(String s1,String s2){
        int freq1[]=new int[300];
        int freq2[]=new int[300];

        for(int i=0;i<s1.length();i++)
        {
           if(freq1[s1.charAt(i)]!=freq2[s2.charAt(i)]){
                return false;
        }
        freq1[s1.charAt(i)]=i+1;
        freq2[s2.charAt(i)]=i+1;

        }
        return true;  
    }
}
