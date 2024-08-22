/*
 Input: N = 3, Arr = [1, 2, 3]
Output:
{}
{1}
{1, 2}
{1, 2, 3}
{1, 3}
{2}
{2, 3}
{3}

1. (USING BIT MANIPULATION )

public static void printsubsets(int arr[], int n)
    {
    ArrayList<ArrayList<Integer>>listoflist=new ArrayList<>();

        for(int i=0;i<(1<<n);i++)
        {   ArrayList<Integer>list=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if(checkBit(i,j))
                    list.add(arr[j]);
            }
            listoflist.add(list);
        }


        for(ArrayList<Integer>l:listoflist)
            System.out.println(l);
    }

    public static boolean checkBit(int i, int j)
    {
        if(((i>>j)&1)!=0)
        return true;
        else
        return false;
    }
*/
//2. USING BACKTRACKING 
import java.util.*;

public class PrintSubsets {

    public static void main(String [] args)
    {
        int arr[]={5 ,15, 3 };
        Arrays.sort(arr);
     List<List<Integer>>ans= generatesubsets(arr);

     Collections.sort(ans,new Comparator<List<Integer>>(){
        public int compare(List<Integer>l1,List<Integer>l2)
        {
            if(l1.isEmpty()&&l2.isEmpty())
                return 0;
            else if(l1.isEmpty())
            return -1;
            else if(l2.isEmpty())
            return 1;

            return l1.get(0).compareTo(l2.get(0));
        }
     });
     for(List<Integer>l:ans)
     System.out.println(l);
    }

    public static List<List<Integer>> generatesubsets(int arr[])
    {
        List<List<Integer>>result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),arr,0);
        return result;
    }

public static void backtrack(List<List<Integer>>result, ArrayList<Integer>temp, int arr[],int start)
{

   result.add(new ArrayList<>(temp));
   for(int i=start;i<arr.length;i++) 
   {
    //ele taken
    temp.add(arr[i]);

    //backtrack
    backtrack(result,temp,arr,i+1);

    //ele not taken
    temp.remove(temp.size()-1);
   }
}

    
}
