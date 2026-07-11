class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int min=Integer.MAX_VALUE;
        int left=1;
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
        }
        int right=max;


        while(left<=right){
            int sum=0;
            int mid=left+(right-left)/2;
            
            for(int i=0;i<nums.length;i++){
                int x=(int)(Math.ceil((double)(nums[i])/mid));
                sum+=x;
            }

            if(sum==h){
                if(mid<min)min=mid;
                right=mid-1;
            }
            else if(sum<h){
                if(mid<min)min=mid;
                right=mid-1;
            }
            else{
                
                left=mid+1;
            }
        }

        return min;
    }
}
