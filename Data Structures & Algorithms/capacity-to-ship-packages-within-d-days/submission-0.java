class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int right=1;
        int left=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<weights.length;i++){
            if(left<weights[i])left=weights[i];
            right+=weights[i];
        }

        while(left<=right){
            int curr=1;
            int sum=0;
            int mid=left+(right-left)/2;
            for(int i=0;i<weights.length-1;i++){
                sum+=weights[i];
                if(sum+weights[i+1]>mid){
                    sum=0;
                    curr++;
                }
            }

            if(curr==days){
                if(min>mid)min=mid;
                right=mid-1;
            }
            else if(curr<days){
                if(min>mid)min=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }

        
        return min;
    }
}