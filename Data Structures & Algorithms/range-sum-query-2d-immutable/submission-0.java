class NumMatrix {
    int[][] matrix;
    public NumMatrix(int[][] matrix) {
        this.matrix=new int[matrix.length+1][matrix[0].length+1];
        int row=matrix.length+1;
        int column=matrix[0].length+1;
        for(int i=1;i<row;i++){
            for(int j=1;j<column;j++){
                this.matrix[i][j]=matrix[i-1][j-1]+this.matrix[i-1][j]+this.matrix[i][j-1]-this.matrix[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans=matrix[row2+1][col2+1]-matrix[row1][col2+1]-matrix[row2+1][col1]+matrix[row1][col1];

        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */