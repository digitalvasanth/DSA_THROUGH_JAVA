import java.util.*;
public class PowerSet {
    
    public static void main(String [] args)
    {
        int arr[]={1,2,3};
        
        printSubSets(arr);
    }
    public static void printSubSets(int arr[])
    {
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
       
        for(int i=0;i<poww(2,arr.length);i++)
        {
            ArrayList<Integer>il=new ArrayList<>();
            for(int j=0;j<arr.length;j++)
            {
                if((i&(1<<j))!=0)
                il.add(arr[j]);
            }
            list.add(il);
        }
       
        for(ArrayList<Integer>i:list)
        {
            System.out.println(i);
        }

    }
    public static int poww(int a, int n)
    {
        int ans=1;
        int  x=a;
        while(n!=0)
        {
            if((n&1)!=0)
            ans=ans*x;

            x=x*x;
            n=n>>1;
        }
        return ans;
    }
}
