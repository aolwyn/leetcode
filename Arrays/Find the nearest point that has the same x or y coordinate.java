class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
    //manhattan distance between 2 points: abs(x1-x2)+abs(y1-y2)
        int distance = Integer.MAX_VALUE;  //start distance.
        int index = -1; //basic index should be -1
      
        for(int i = 0; i < points.length; i++){//loop through the size of the 2D array
             int[] point = points[i];//assign a temp value for a single set of coordinates.
             if (x == point[0] || y == point[1]) { //if the x lines up with the x coordinate in points or y coordinate lines up with y coord in points,
                                                   //assign the distance to a temp variable. if the temp variable is less than the previous distance,
                                                   //save the value and it's index. 
                int temp = Math.abs(x - point[0]) + Math.abs(y - point[1]);
                if (temp < distance) {
                    distance = temp;
                    index = i;
                }//close if
                
            }
        }//close for
        return index;
        
        
    }
}
