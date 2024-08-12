public class ReverseSentence {
    
    public static void main(String [] args)
    {
     String s=" data structures and algorithms      ";

    s=s.trim();
    String arr[]=s.split("\\s+");
    for(int i=arr.length-1;i>=0;i--)
    {
        if(i>0)
        System.out.print(arr[i]+" ");
        else
        System.out.print(arr[i]);
    }

    }
}
