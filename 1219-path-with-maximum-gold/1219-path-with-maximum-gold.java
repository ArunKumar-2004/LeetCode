class Solution {
    int max=0;
    public int getMaximumGold(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    Crack(grid,i,j,0);
                }
            }
        }
        return max;
    }
    public void Crack(int grid[][],int i,int j,int curr){
        max=Math.max(curr,max);
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0){
            return;
        }
        int temp=grid[i][j];
        grid[i][j]=0;
        Crack(grid,i+1,j,curr+temp);
        Crack(grid,i-1,j,curr+temp);
        Crack(grid,i,j+1,curr+temp);
        Crack(grid,i,j-1,curr+temp);
        grid[i][j]=temp;
    }
}
