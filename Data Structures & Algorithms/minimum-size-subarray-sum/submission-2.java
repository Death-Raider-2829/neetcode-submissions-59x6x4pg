class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length=Integer.MAX_VALUE;
        int sum=0;
        int left=0,right=0;
        boolean found=false;

        while(right<nums.length){
            while(right<nums.length && sum<target){
                sum+=nums[right];
                right++;
            }

            if(found==false && right==nums.length && sum<target) return 0;

            while(sum>=target){
                sum-=nums[left];
                left++;
            }
            if(right-left<length){length=right-left;
                found=true;
            }

        }

        return length+1;
    }
}