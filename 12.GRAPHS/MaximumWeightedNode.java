import java.util.*;
public class MaximumWeightedNode {
   
    public static void helper_function()
    {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();

        while(t-->0){
        int n=sc.nextInt();
        int edges[]=new int[n];
        for(int i=0;i<n;i++)
        edges[i]=sc.nextInt();

            int weights[]=new int[n];
            for(int i=0;i<n;i++)
            {
                if(edges[i]!=-1)
                weights[edges[i]]+=i;
            }

            int maxweight=-1;
            int maxweightnode=-1;

            for(int i=0;i<n;i++)
            {
                if(weights[i]>maxweight)
                {
                    maxweight=weights[i];
                    maxweightnode=i;
                }
            }
            System.out.println(maxweightnode);
        }
        sc.close();
    }   
    public static void main(String [] args)
    {
        MaximumWeightedNode m=new MaximumWeightedNode();
        m.helper_function();
    }
}
