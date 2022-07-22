class Solution {
    public int numIslands(char[][] grid) {
      int count = 0;//initialize island count to 0.
        //run through each direction and element and see if anything is equal to 1.
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                
                if(grid[i][j] == '1'){//flagged an island, increase count then explore neighbouring land.
                    count++;
                    DFS(grid, i , j);
                }
            }
        }
        return count;
    }
    //helper search function. 
    public void DFS(char[][] grid, int i, int j){
        //bounds check.
        if(i<0 || j<0 || i>=grid.length || j>grid[i].length-1 || grid[i][j] == '0' ) return;
        grid[i][j] = '0';//set the value to 0 after exploring so we know it has been visited.
        //visit other directions and see if there is land.         
        DFS(grid,i+1,j);
        DFS(grid,i-1,j);
        DFS(grid,i,j+1);
        DFS(grid,i,j-1);
    }   
}
