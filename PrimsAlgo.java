
package primsprogram;


import java.util.Scanner;

public class PrimsAlgo {

    int[] visited;
    int[] key;
    int[] parent;
    int tv;
    int m,n;
    char ch;
    int[][] arr;
        
    Scanner scanner = new Scanner(System.in);
    void init()
    {
        System.out.println("Enter total no of vertices:");
        tv = scanner.nextInt();    
        
        arr = new int[tv+1][tv+1];
        
        for(int i=1;i<=tv;i++)
        {
            for(int j=1;j<=tv;j++)
            {
                System.out.println("If arr "+i+" to "+j+" has edge enter y");
                ch = scanner.next().charAt(0);
                if(ch=='y')
                {   System.out.println("Enter weight:");
                    arr[i][j]=scanner.nextInt();
                }else
                {
                    arr[i][j]=999;
                }
            }
        }
        for(int i=1;i<=tv;i++)
        {
            for(int j=1;j<=tv;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
            }
        visited = new int[tv+1];
        key = new int[tv+1];
        parent = new int[tv+1];
        for(int i=1;i<=tv;i++)
        {
            visited[i] = -1;
            key[i] = 999;
            parent[i] = 0;
        }
        
       
        key[1]=0;
        for(int i=1;i<=tv;i++)
        {
            int u=min(key,visited);
            visited[u]=1;
            for(int v=1;v<=tv;v++)
            {
                if(arr[u][v]!=999&&visited[v]==-1&&arr[u][v]<key[v])
                {
                    key[v]=arr[u][v];
                    parent[v]=u;
                }
            }
        }
        for(int i=1;i<=tv;i++)
        {
            System.out.println(parent[i]+" "+i+" "+key[i]);
        }
        }
     int min(int key[],int vis[])
    {
        int vm=0;
        m=999;
        for(int i=1;i<=tv;i++)
        {
            if(visited[i]== -1 &&key[i]<=m)
            {
                m=key[i];
                vm=i;
            }
        }
        
        return vm;
    }
    
    public static void main(String[] args) {
     
       PrimsAlgo pa = new PrimsAlgo();
       pa.init();
    }
    
}
