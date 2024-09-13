import java.util.*;
public class NearestMeetingCell {
    
    public static void main(String [] args)
    {
        int n=23;
        int edges[]={4, 4, 1, 4, 13, 8, 8, 8, 0, 8, 14, 9, 15, 11, -1, 10, 15, 22, 22, 22, 22, 22, 21};
        int c1=9;
        int c2=2;
        System.out.println(findleast(n,edges,c1,c2 ));
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
