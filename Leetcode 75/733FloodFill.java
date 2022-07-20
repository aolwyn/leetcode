class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //we will use a traversal technique --> DFS.
        //base case check, if it isnt equal to the new color. 
        //otherwise it is same color, just send back
        if(image[sr][sc] != color){
            DFS(image, sr, sc, image[sr][sc], color);   
        }
        return image;
    }  
    
    //depth first search algorithm implementation. 
    public void DFS(int[][] image, int i, int j, int orColor, int newColor){
        //bounds check and making sure the colors are ok to use (problem occurs if same color)
        if(i < 0 || j < 0 || i >= image.length || j>= image[0].length || image[i][j] != orColor) return;
        //set new color.
        image[i][j] = newColor;
        //4-directional search 
        DFS(image, i, j - 1, orColor, newColor);
        DFS(image, i, j + 1, orColor, newColor);
        DFS(image, i - 1, j, orColor, newColor);
        DFS(image, i + 1, j, orColor, newColor);
    }//close helper method
}