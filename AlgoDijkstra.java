
package dijkstraprogram;

import java.util.Arrays;

public class AlgoDijkstra {
   
    int[] visited;
    int[] dist;
    String[] path;
    int min,v1,length;
   
   void disalgo(int[][] arr,int sn)
   {
       length = arr.length;
       visited = new int[length];
       dist = new int[length];
       path = new String[length];
       
       for(int i=1;i<length;i++)
       {
           visited[i]=-1;
           dist[i]=999;
           path[i]=String.valueOf(sn);
       }
       visited[1]=1;
       for(int i=2;i<length;i++)
       {
           dist[i]=arr[1][i];
           path[i]=String.valueOf(sn)+String.valueOf(i);
       }
       
       for(int i=2;i<length;i++)
       {
           min=999;v1=-1;
           for(int j=2;j<length;j++)
           {
               if(dist[j]<min&&visited[j]==-1)
               {
                   min=dist[j];
                   v1=j;
               }
               visited[length-1]=1;
           }
       }
       
       for(int v2=2;v2<length;v2++)
       {
           if(arr[v1][v2]!=999&&(dist[v2]>dist[v1]+arr[v1][v2]))
           {
               dist[v2]=dist[v1]+arr[v1][v2];
               path[v2]=path[v2]+String.valueOf(v2);
           }
       }
       
       
   }
   
   void display()
   {
       System.out.println(Arrays.toString(dist));
       System.out.println(Arrays.toString(path));
       
   }
    
}
