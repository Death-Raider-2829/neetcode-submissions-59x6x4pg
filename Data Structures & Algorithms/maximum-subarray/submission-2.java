class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];

        for(int i = 1; i < nums.length; i++){
            // Compute what is the bigger number. That is if we add the current number or start a new sum from the current number 
            sum = Math.max(sum + nums[i], nums[i]);
            // Compute if the maximum is the current sum or the maximum we have already stored
            max = Math.max(max, sum);
        }

        return max;
    }
}
