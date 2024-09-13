import java.util.*;
public class NearestMeetingCell {
    

    public static void helper_function()
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] edges = new int[n];
            for (int i = 0; i < n; i++) {
                edges[i] = sc.nextInt();
            }

            int c1=sc.nextInt();
            int c2=sc.nextInt();

            int result=findleast(n, edges, c1, c2);
            System.out.println(result);

        }

    }
    public static void main(String [] args)
    {
        NearestMeetingCell m=new NearestMeetingCell();
        m.helper_function();
    }

    public static int findleast(int n,int edges[],int c1,int c2)
    {
        //starting points
        int x=c1;
        int y=c2;
        Set<Integer>seta=new HashSet<>();
        Set<Integer>setb=new HashSet<>();
        while (true) { 
            if(seta.contains(x)||setb.contains(y)||x==-1||y==-1)
            return -1;
            if(setb.contains(x))
                return x;
            if(seta.contains(y))
                return y;
            if(x!=-1)
            {
                seta.add(x);
                x=edges[x];
            }
            if(y!=-1)
            {
                setb.add(y);
                y=edges[y];
            }
        }

    }
}
