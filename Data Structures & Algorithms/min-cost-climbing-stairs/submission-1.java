class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        Arrays.fill(dp,-1);
        dp[0]=cost[0];
        dp[1]=cost[1];
        return Math.min(helper(cost,cost.length-1,dp),helper(cost,cost.length-2,dp));
    }

    int helper(int[] cost,int index,int[] dp){
        if(index<0)return 0;
        if(dp[index]!=-1)return dp[index];

        return dp[index]=cost[index]+Math.min(helper(cost,index-1,dp),helper(cost,index-2,dp)); 
    }
}
