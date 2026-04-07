class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        int mini=index(nums);
        if(mini==-1){
            return-1;
        }

        if(nums[mini]==target){
            return mini;
        }

        int l=binary(nums,target,0,mini-1);
        int r=binary(nums,target,mini+1,nums.length-1);

        if(l!=-1){
            return l;
        }
        else{
            return r;
        }
    }

    public int binary(int[] nums,int target,int left,int right){
        if(left==-1 || left>right){
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

    public int index(int[] nums){
        int left=0;
        int right=nums.length-1;
        int n=nums.length;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[(mid+n)%n]<=nums[(mid+n+1)%n] && nums[(mid+n)%n]<=nums[(mid-1+n)%n]){
                return mid;
            }
            else if(nums[(mid+n)%n]>nums[right]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }

}
