
package Backtracking;


public class GraphColoring
{    
    public int V;
    public int[][] graph;
    public int ColorsNum;
    public int[] color; 
    
    //function to check if there are solutions or not
    public boolean graphColor(int[][] g, int m)
    {
        V = g.length;
        ColorsNum = m;
        color = new int[V];
        graph = g;
 
        try
        {
            rec(0); //start from vetex 0
            System.out.println("\nNo solutions Exist! ");
            return false;
        }
        catch (Exception e)
        {
            System.out.println("\nSolution exists ");
            printColors();
            return true;
        }
    }
    // The Recusive function to assign the colors 
    public boolean rec(int v) throws Exception
    {
        // base case,reach the end of graph
        if (v == V)
            throw new Exception("Solution found");
        // find the suitable color 
        for (int c = 1; c <= ColorsNum; c++)
        {
            if (isSuitable(v, c))
            {
                // assign the color to the vertx
                color[v] = c;
                rec(v + 1);
                // wrong assignment 
                color[v] = 0;
                return true;
            }
        }  
        return false;
    }
    //function to check if the color is valid or not 
    public boolean isSuitable(int v, int c)
    {
        for (int i = 0; i < V; i++)
            // check if there is edge and the color is valid
            if (graph[v][i] == 1 && c == color[i])
                return false;
        return true;
    }
    /** display solution **/
    public void printColors()
    {
        System.out.print("\nThe Assigned Colors Are : \n");
        for (int i = 1; i <= V; i++)
            System.out.print("\nThe Color of Vertex " + i +" --> color  " + color[i-1] +"\n");
        //System.out.println();
    }
}
