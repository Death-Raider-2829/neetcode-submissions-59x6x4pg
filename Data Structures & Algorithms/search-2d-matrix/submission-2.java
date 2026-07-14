class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=matrix[0].length-1;

        for(i=0;i<matrix.length;i++){
            if(matrix[i][0]<=target && matrix[i][j]>=target){
                int left=0,right=j;
                while(left<=right){
                    int mid=left+(right-left)/2;
                    if(matrix[i][mid]==target)return true;
                    else if(matrix[i][mid]>target)right=mid-1;
                    else left=mid+1;
                }
                break;
            }
        }
        return false;
    }
}
