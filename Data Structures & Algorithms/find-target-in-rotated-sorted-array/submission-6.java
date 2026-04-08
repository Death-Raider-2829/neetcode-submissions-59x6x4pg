class Solution {
    public int search(int[] nums, int target) {
        // Main goal is simple
        // Find minimum and separate the array into two across that point
        int left=0;
        int right=nums.length-1;
        int n=nums.length;
        int min_index=-1;
        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[(mid-1+n)%n]>=nums[(mid+n)%n] && nums[(mid+n)%n]<=nums[(mid+1+n)%n]){
                min_index=mid;
                break;
            }
            else if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }

        if(min_index==-1 || nums[min_index]==target){
            return min_index;
        }

        int l=binary(nums,target,0,min_index-1);
        int r=binary(nums,target,min_index+1,nums.length-1);

        if(l!=-1){
            return l;
        }
        else{
            return r;
        }
    }

    static int binary(int[] nums, int target, int left, int right){
        if(left==-1 ||left>right){
            return -1;
        }
        
        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return -1;
    }
}
