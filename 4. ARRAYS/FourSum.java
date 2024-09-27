/*
 Input Format:
 arr[] = [4,3,3,4,4,2,1,2,1,1], target = 9
Result:[[[1,1,3,4],[1,2,2,4],[1,2,3,3]]
Explanation:
 The sum of all the quadruplets is equal to the target i.e. 9.


 1. BRUTE FORCE

 public static  List<List<Integer>>find(int arr[],int n,int target)
    {
        Set<List<Integer>>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {  
                    for(int l=k+1;l<n;l++)
                    {
                        int sum=arr[i]+arr[j]+arr[k]+arr[l];
                        if(sum==target)
                        {
                            ArrayList<Integer>temp=new ArrayList<>();
                            temp.add(arr[i]);
                            temp.add(arr[j]);
                            temp.add(arr[k]);
                            temp.add(arr[l]);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>>ans=new ArrayList<>(set);
        return ans;
    }


    2. BETTER APPROACH

    public static  List<List<Integer>>find(int arr[],int n,int target)
    {
        Set<List<Integer>>s=new HashSet<>();

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                Set<Integer>set=new HashSet<>();
                for(int k=j+1;k<n;k++)
                {
                    int fourth=target-(arr[i]+arr[j]+arr[k]);
                    if(set.contains(fourth))
                    {
                        ArrayList<Integer>temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(fourth);
                        Collections.sort(temp);
                        s.add(temp);
                    }
                    else
                    set.add(arr[k]);
                }
            }
        }
        List<List<Integer>>ans=new ArrayList<>(s);
        Collections.sort(ans,new Comparator<List<Integer>>(){

            public int compare(List<Integer>l1,List<Integer>l2)
            {
                for(int i=0;i<l1.size();i++){
                    int cmp=Integer.compare(l1.get(i),l2.get(i));
                    if(cmp!=0)
                        return cmp;
                }
                return 0;
            }
        });
        return ans;
    }

 */
//3. OPTIMAL 
import java.util.*;
public class FourSum {
    

    public static void main(String [] args)
    {
        int arr[]={4,3,3,4,4,2,1,2,1,1};
        int target=9;
        Arrays.sort(arr);
        List<List<Integer>>ans=find(arr,arr.length,target);

        for(List<Integer>l:ans)
        System.out.println(l);
    }


    public static  List<List<Integer>>find(int arr[],int n,int target)
    {
        
        Arrays.sort(arr);

        List<List<Integer>>ans=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            if(i>0&&arr[i]==arr[i-1])continue;
            for(int j=i+1;j<n;j++)
            {
                if(j>i+1&&arr[j]==arr[j-1])continue;
                int p1=j+1;
                int p2=n-1;
                while(p1<p2)
                {
                    long sum=arr[i]+arr[j];
                    sum+=arr[p1];
                    sum+=arr[p2];

                    if(sum==target)
                    {
                        ArrayList<Integer>temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[p1]);
                        temp.add(arr[p2]);
                        ans.add(temp);

                        p1++;
                        p2--;
                        while(p1<p2&&arr[p1]==arr[p1-1])p1++;
                        while(p1<p2&&arr[p2]==arr[p2+1])p2--;

                    }
                    else if(sum<target)
                    p1++;
                    else
                    p2--;
                }
            }
            
        }
        return ans;
    }
}
