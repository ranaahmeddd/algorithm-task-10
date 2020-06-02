package Backtracking;

import java.util.Scanner;

public class Backtracking {

    
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        //scanning the number of colors 
        System.out.println("Please,Enter the number of colors : ");
        int m = s.nextInt();
 
        // scanning the number of vertices
        System.out.println("\nPlease,Enter the number of vertices : ");
        int V = s.nextInt();
 
        //scanning the graph
        System.out.println("\nPlease,Enter The Adjacency matrix representation of your graph : ");
        int[][] graph = new int[V][V];
        for (int i = 0; i < V; i++)
            for (int j = 0; j < V; j++)
                graph[i][j] = s.nextInt();
 
        // Creating object from GraphColoring class and call graphcolor method
        GraphColoring obj = new GraphColoring();
        obj.graphColor(graph, m);
 
    }
    }
    

