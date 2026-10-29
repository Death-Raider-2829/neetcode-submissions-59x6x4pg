class Solution {
    public int jump(int[] nums) {
        int farthest = nums[0], currentEnd = 0, jumps = 0;

        for(int i = 0; i < nums.length - 1; i++){
            farthest = Math.max(nums[i]+i,farthest);
            if(i == currentEnd){
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }
}
