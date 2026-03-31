class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] post_product=new int[nums.length];
        int[] pre_product=new int[nums.length];
        post_product[nums.length-1]=1;
        pre_product[0]=1;

        for(int i=post_product.length-2;i>=0;i--){
            post_product[i]=post_product[i+1]*nums[i+1];    
        }
        
        for(int i=1;i<nums.length;i++){
            pre_product[i]=pre_product[i-1]*nums[i-1];    
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=pre_product[i]*post_product[i];
        }
        return nums;
    }
}  
