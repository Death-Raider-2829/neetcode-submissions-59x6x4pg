class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre=new int[nums.length];
        pre[0]=nums[0];
        int[] post=new int[nums.length];
        post[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]*nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            post[i]=post[i+1]*nums[i];
        }

        for(int i=0;i<nums.length;i++){
            int product=1;
            if(i>0){
                product*=pre[i-1];
            }
            if(i<nums.length-1){
                product*=post[i+1];
            }
            nums[i]=product;
        }
        return nums;
    }
}  
