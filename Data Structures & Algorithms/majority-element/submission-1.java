class Solution {
    public int majorityElement(int[] nums) {
        int curr=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==curr)count++;
            else count--;

            if(count==0){
                count=1;
                curr=nums[i];
            }
        }

        return curr;
    }
}