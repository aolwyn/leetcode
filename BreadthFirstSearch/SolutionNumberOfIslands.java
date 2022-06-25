package BreadthFirstSearch;

public class SolutionNumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i =0; i<grid.length; i++){
            for(int j = 0; j< grid[i].length; j++){
                
                if(grid[i][j] == '1')
                    count++;
                    BFS(grid, i, j);
}//close for j
        }//close for i
        return count;
    }//close numIslands
    
    
    
    public void BFS(char[][] grid, int i, int j){
        if( i < 0 || j < 0 || i>= grid.length || j> grid[i].length-1 || grid[i][j] == '0')return;
        grid[i][j] = '0';
        
        BFS(grid, i+1, j);
        BFS(grid, i-1, j);
        BFS(grid, i, j+1);
        BFS(grid, i, j-1);
 
    }//close function




}//close class
