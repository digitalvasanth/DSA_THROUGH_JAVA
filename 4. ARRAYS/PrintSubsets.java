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
 */

import java.util.*;

public class PrintSubsets {

    public static void main(String [] args)
    {
        int arr[]={1,2,3};
        
        printsubsets(arr,arr.length);
    }


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
}
