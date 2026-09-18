class Solution {
    public int rob(int[] nums) {
        int[] dp1=new int[nums.length];
        int[] dp2=new int[nums.length];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        if(nums.length<=2){
            if(nums.length==1){
                return nums[0];
            }
            else{
                return Math.max(nums[0],nums[1]);
            }
        }
        return Math.max(helper(nums,1,nums.length,dp1),helper(nums,0,nums.length-1,dp2));
    }

    int helper(int[] nums,int start,int end,int[] dp){
        if(start>=end)return 0;
        if(dp[start]!=-1)return dp[start];

        int take=nums[start]+helper(nums,start+2,end,dp);
        int skip=helper(nums,start+1,end,dp);

        return dp[start]=Math.max(take,skip);
    }
}
