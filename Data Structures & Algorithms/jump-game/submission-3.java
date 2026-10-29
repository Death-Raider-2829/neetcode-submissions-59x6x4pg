class Solution {
    public boolean canJump(int[] nums) {
        boolean[] reachable = new boolean[nums.length];

        if(nums.length == 0 || nums.length == 1)return true; 
        if(nums[0] != 0) reachable[0] = true;

        for(int i = 0; i <nums.length; i++){
            int jump = nums[i];

            if(reachable[i] == false) return false;
            for(int j = i+1; j < i+1+jump; j++){
                if(j >= reachable.length) break;
                reachable[j] = true;
            }
            if(reachable[nums.length - 1] == true) return true;
        }

        return false;
    }
}
