class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length==0 || k%nums.length==0){
            return;
        }
        k=k%nums.length;
        for(int i=0;i<(nums.length)/2;i++){
            int temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }

        for(int i=0;i<k/2;i++){
            int temp=nums[i];
            nums[i]=nums[k-1-i];
            nums[k-1-i]=temp;
        }
        
        int i=k;
        int j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}