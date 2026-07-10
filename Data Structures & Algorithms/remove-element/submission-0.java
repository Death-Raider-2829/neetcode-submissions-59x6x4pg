class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        int count=0;
        for(i=0;i<nums.length;i++){
            while(i<nums.length && nums[i]==val)i++;
            if(i==nums.length)return count;
            nums[j]=nums[i];
            j++;
            count++;
        }

        return count;
    }
}