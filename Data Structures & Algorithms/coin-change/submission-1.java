class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp=new int[amount+1];
        Arrays.fill(dp,-2);
        for(int i=0;i<coins.length;i++){
            int index=coins[i];
            if(index<dp.length){
                dp[index]=1;
            }
        }
        if(amount==0)return 0;
        if(amount<coins[0])return -1;
        return helper(coins,amount,dp);
    }

    int helper(int[] coins,int amount,int[] dp){
        if(amount<0)return Integer.MAX_VALUE;
        if(amount==0)return 0;
        if(dp[amount]!=-2)return dp[amount];
        int min=Integer.MAX_VALUE;

        for(int i=0;i<coins.length;i++){
            int curr=helper(coins,amount-coins[i],dp);
            if(curr!=-1 && curr!=Integer.MAX_VALUE){
                min=Math.min(min,1+curr);
            }
        }
        if(min==Integer.MAX_VALUE)dp[amount]= -1;
        else dp[amount]=min;
        return dp[amount];
    }
}
