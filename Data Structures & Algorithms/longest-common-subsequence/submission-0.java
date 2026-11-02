class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];

        int row = text1.length()-1;
        int col = text2.length()-1;

        helper(text1,text2,dp,row,col);

        return dp[text1.length() - 1][text2.length() - 1];
    }

    int helper(String text1, String text2, int[][] dp, int row, int col){
        if(row < 0 || col < 0){
            return 0;
        }

        if(dp[row][col] != 0)return dp[row][col];

        if(text1.charAt(row) == text2.charAt(col)){
            return dp[row][col] = 1 + helper(text1, text2, dp, row-1, col-1);
        }
        else{
            return dp[row][col] = Math.max(helper(text1, text2, dp, row-1, col), helper(text1, text2, dp, row, col-1));
        }
    }
}
