class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-1);
        if(amount==0)return 0;
        int x=helper(coins,amount,dp);
        return (x==0)? -1:x;
    }

    int helper(int[] coins,int amount,int[] dp){
        if(amount==0)return 0;
        
        if(amount<0)return Integer.MAX_VALUE;

        if(dp[amount]!=-1)return dp[amount];

        int min=Integer.MAX_VALUE;

        for(int i=0;i<coins.length;i++){
            int curr=helper(coins,amount-coins[i],dp);
            if(curr!=-1 && curr!=Integer.MAX_VALUE){
                min=Math.min(min,curr+1);
            }
        }

        dp[amount]=min;

        return (min==Integer.MAX_VALUE)? -1: min;
    }
}
