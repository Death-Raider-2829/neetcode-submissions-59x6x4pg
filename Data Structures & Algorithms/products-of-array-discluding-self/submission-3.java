class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];

        for(int i=0;i<left.length;i++){
            if(i==0){
                left[i]=1;
            }
            else{
                left[i]=nums[i-1]*left[i-1];
            }
        }

        for(int i=right.length-1;i>=0;i--){
            if(i==right.length-1){
                right[i]=1;
            }
            else{
                right[i]=right[i+1]*nums[i+1];
            }
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=left[i]*right[i];
        }

        return nums;
    }
}  
