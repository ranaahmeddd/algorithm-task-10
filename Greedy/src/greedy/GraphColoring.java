
package greedy;


public class GraphColoring {
    public int V;
    public int[][] graph;
    public int[] color; 
    public boolean[] colorUsed;
    public int colorNum;
    
   public void graphColor(int[][] g , int m){
      int noColor = m;
      V = g.length;
      color = new int[V];
      graph = g;
        
   color[0] = 1;    //Assign first color for the first node, the first node here if 1 and first color is 1
   colorUsed = new boolean[V];    //Used to check whether color is used or not

   for(int i = 1; i <V; i++)
      color[i] = -1;    //initialize all other vertices are unassigned

   for(int i = 0; i <V; i++)
      colorUsed[i] = false;    //initially any colors are not chosen
         
   for(int u = 1; u <V; u++) {    //for all other V - 1 vertices
      for(int v = 0; v<V; v++) {
         if(graph[u][v] == 1){
            if(color[v] != -1)    //when one color is assigned, make it unavailable
               colorUsed[color[v]] = true;
         }
     }

     int c;
     for(c = 1; c<=V; c++)
        if(colorUsed[c]==false)    //find the first available color
           break;
         
     color[u] = c;    //assign found color 
         
     for(int v = 0; v <V; v++) {   // Reset the values back to false for the next iteration
        if(graph[u][v] == 1) {
           if(color[v] != -1)
              colorUsed[color[v]] = false;
        }
     }  
  }
   //call comparison function to compare the results with number of colors
  comparison(noColor);
}
   public void printResult(){
     for(int j = 1; j<=V; j++)
        System.out.println(" The color of vertex " + j + "--> color " +color[j-1] + "\n");
   }
   
   public void comparison (int m){ //comparing the number of colors with the calculated result
     colorNum = m;
     int max=0;
     for(int i=0 ; i< V; i++  ){
         if (color[i]>max){
         max = color[i];
         }
     }
     if (max <= colorNum){
         System.out.println("\nThis number of colors is available\n");
         System.out.println("The Result is : \n");
         printResult();
     }
     else {
      System.out.println("\nYou can't assign with this number of colors!\n");
      System.out.println("The minimum number you can use is " + max + "\n");
      System.out.println("The Result is : \n");
      printResult();
     }
   }
}
