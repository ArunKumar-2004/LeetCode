class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] rowZero=new boolean[matrix.length];
        boolean[] colZero=new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==0) {
                    rowZero[i]=true;
                    colZero[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(rowZero[i] || colZero[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
