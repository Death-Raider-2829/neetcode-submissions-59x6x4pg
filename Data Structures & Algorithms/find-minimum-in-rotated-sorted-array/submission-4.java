class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<=nums[(mid-1+nums.length)%nums.length] && nums[mid]<=nums[(mid+1+nums.length)%nums.length]){
                return nums[mid];
            }
            else if(nums[left]>nums[right]){
                if(nums[left]>nums[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }

            else{
                if(nums[mid]<nums[right]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }

        return -1;
    }
}
