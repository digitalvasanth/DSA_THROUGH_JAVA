import java.util.*;
public class BalancedParenthesis {
    
    public static void main(String []args)
    {
        int n=3;
        ArrayList<String>list=new ArrayList<>();
        generate(list,"",n,n);
       for(String s:list)
       System.out.println(s);

    }
    public static void generate(ArrayList<String>list,String s,int open, int close)
    {
        if(open==0&&close==0){
        list.add(s);
        return;}

        if(open>0)
        generate(list,s+"{",open-1,close);
        if(close>open)
        generate(list,s+"}",open,close-1);
    }
}
