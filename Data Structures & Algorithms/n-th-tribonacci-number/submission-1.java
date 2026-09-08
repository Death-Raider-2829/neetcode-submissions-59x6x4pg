class Solution {
    public int tribonacci(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        if(n==0 || n==1){
            return n;
        }
        dp[0]=0;
        dp[1]=1;
        if(n==2){
            return 1;
        }
        dp[2]=1;
        return helper(n,dp);
    }

    int helper(int n, int[] dp){
        if(dp[n]!=-1)return dp[n];
        if(n<0)return 0;
        
        return dp[n]=helper(n-1,dp)+helper(n-2,dp)+helper(n-3,dp); 
    }
}