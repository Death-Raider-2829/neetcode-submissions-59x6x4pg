class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int current=nums[i];
                if(current<0){
                    current=current*-1;
                }
            if(nums[current-1]<0) return current;
            else{
                nums[current-1]*=-1;
            }
        }
        return -1;
    }
}
