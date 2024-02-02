class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row[]=new int[grid.length];
        int col[]=new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                row[i]+=grid[i][j];
                col[j]+=grid[i][j];
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                grid[i][j]=(2*(row[i]+col[j]))-grid.length-grid[0].length;
            }
        }
        return grid;
    }
}