
package greedy;

import java.util.Scanner;

public class Greedy {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        //scanning the number of colors 
        System.out.println("Please,Enter the number of colors : ");
        int m = input.nextInt();
        
        // scanning the number of vertices
        System.out.println("Enter the number of vertices : ");
        int V = input.nextInt();
 
        //scanning the graph
        System.out.println("\nEnter The Adjacency matrix representation of your graph : ");
        int[][] graph = new int[V][V];
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                graph[i][j] = input.nextInt();
 
        // Creating object from GraphColoring class and call graphcolor method
        GraphColoring g = new GraphColoring();
        g.graphColor(graph,m);
    }
    
}
