class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];

        int min=nums[0];
        
        int[] dp=new int[nums.length];
        int answer=nums[0];

        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(nums[i],Math.max(nums[i]*min,nums[i]*max));
            int newMin=Math.min(nums[i],Math.min(nums[i]*max,nums[i]*min));
            int newMax=Math.max(nums[i],Math.max(nums[i]*max,nums[i]*min));
            answer=Math.max(answer,newMax);

            min=newMin;
            max=newMax;
        }

        return answer;
    }
}
