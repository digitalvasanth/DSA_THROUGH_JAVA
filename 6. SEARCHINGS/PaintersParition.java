
public class PaintersParition {
    public static void main(String args[])
    {
        int boards[]={10,20,30,40};
        int k=2;
        int max=boards[0];
        int sum=0;
        for(int i:boards)
        {
            if(i>max) 
                max=i;
            
            sum+=i;
        }
        int low=max;
        int high=sum;

        while(low<=high)
        {
            int mid=(low+high)/2;


        }

    }
}
