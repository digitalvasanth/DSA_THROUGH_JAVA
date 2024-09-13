import java.util.*;

public class LargestSumCycle {

    public static void helper_function() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] edges = new int[n];
            for (int i = 0; i < n; i++) {
                edges[i] = sc.nextInt();
            }
               
            int result = solution(edges);
            System.out.println(result);
        }
        sc.close();
    }   

    public static int solution(int[] edges) {
    int vis[] = new int[edges.length];
    int maxi = -1;
    int maxiSum = 0;
    
    for(int i=0 ; i<edges.length ; ++i){
    
     if(vis[i]==1)  
        continue;       
    
    int cur = i;
    HashMap<Integer,Integer> map = new HashMap<>();    
    
    while(cur != -1){      
                
    if(map.containsKey(cur))
    {   
    int n = map.size();
    int ind = map.get(cur);
    int sum = 0;
    
    for(Map.Entry<Integer,Integer> it : map.entrySet())
    {   
        if(it.getValue()>=ind)  
         sum = sum +it.getKey();
     }
    
    
    maxiSum = Math.max(sum,maxiSum);
    maxi = Math.max(maxi,n-ind+1);
        break;
    }
    if(vis[cur] == 1)  
        break;  
    vis[cur] = 1;
    
    map.put(cur,map.size()+1);
    cur = edges[cur];  
                }
    
            }

            // System.out.println(maxi);       
    return maxiSum;
    }

    private static int dfs(int[] edges, int node, boolean[] visited, boolean[] inStack, Set<Integer> pathNodes) {
        if (inStack[node]) {
            // Cycle detected, calculate the sum
            int cycleSum = 0;
            boolean found = false;
            for (int v : pathNodes) {
                cycleSum += v;
                if (v == node) {
                    found = true;
                    break;
                }
            }
            return found ? cycleSum : 0;
        }

        if (visited[node] || edges[node] == -1) {
            return -1; // No cycle or dead end
        }

        visited[node] = true;
        inStack[node] = true;
        pathNodes.add(node);

        int nextNode = edges[node];
        int cycleSum = dfs(edges, nextNode, visited, inStack, pathNodes);

        inStack[node] = false;
        pathNodes.remove(node);

        return cycleSum;
    }

    public static void main(String[] args) {
        helper_function();
    }
}
